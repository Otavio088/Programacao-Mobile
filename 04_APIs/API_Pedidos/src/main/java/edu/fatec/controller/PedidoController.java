package edu.fatec.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.model.Item;
import edu.fatec.model.Pedido;

@RestController
public class PedidoController {
	
	private List<Pedido> listaPedidos = new ArrayList<Pedido>();
	
	@PostMapping(path = "/pedidos") //cadastra pedidos
	public ResponseEntity<?> salvarPedido(@RequestBody Pedido pedido) {
		if (pedido.getItems().size() == 0) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Pedido sem itens!");
		}
		
		Map<Integer, Integer> mapItem = new HashMap<>();
		
		for(Item i : pedido.getItems()) {
			mapItem.put(i.getId(), (mapItem.getOrDefault(i.getId(), 0) + 1));
		}
		
		for(Entry<Integer, Integer> m : mapItem.entrySet()) {
			if(m.getValue() > 1) {
				return ResponseEntity.status(HttpStatus.CONFLICT).body("Id está igual!");
			}
		}
		
		for (int i = 0; i < pedido.getItems().size(); i++) {
			for (int j = i+1; j < pedido.getItems().size(); j++) {
				
//				if (pedido.getItems().get(i).getId().equals(pedido.getItems().get(j).getId())) { //o id de um unico pedido é igual:
//					return ResponseEntity.status(HttpStatus.CONFLICT).body("Id está igual!");
//				}
//						
			}
			
			pedido.getItems().get(i).setTotal(pedido.getItems().get(i).getValor() * 
					pedido.getItems().get(i).getQuantidade()); //calcula total dos items do pedido
			pedido.setTotal(pedido.getItems().get(i).getTotal() + pedido.getTotal()); //calcula total do pedido
		}
		
		pedido.setCodigo((int) (Math.random() * 1000)); //gera codigo aleatorio para o pedido
		pedido.getCliente().setCodigo((int) (Math.random() * 1000)); //gera codigo aleatorio para o cliente
		
		this.listaPedidos.add(pedido); //adiciona pedido a lista
		
		return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
	}
	
//	@GetMapping(path = "/pedidos") //consulta todos os pedidos
//	public List<Pedido> consultarPedido() {
//		
//		return this.listaPedidos;
//	}
	
	@GetMapping(path = "/pedidos") //filtra por tipo de pedido e por codigo do cliente
	public List<Pedido> consultarPedidoPorCodigo_e_TipoPedido(
			@RequestParam(name = "tipo", required = false) String tipoPedido, 
			@RequestParam(name = "codigoCliente", required = false) Integer codCliente) {
		
		List<Pedido> filtroPedidos = new ArrayList<Pedido>();
		
		if (tipoPedido != null && !tipoPedido.isEmpty() && codCliente != null) { //busca por tipo de pedido e codigo do cliente
			for (Pedido p : this.listaPedidos) {
				if (p.getTipo().contains(tipoPedido) && p.getCliente().getCodigo().equals(codCliente)) {
					filtroPedidos.add(p);
				}
			}
			
			return filtroPedidos;
		}
		if (tipoPedido != null && !tipoPedido.isEmpty()) { //busca por tipo de pedido
			for (Pedido p: this.listaPedidos) {
				if (p.getTipo().contains(tipoPedido)) {
					filtroPedidos.add(p);
				}
			}
			
			return filtroPedidos;
		}
		
		if (codCliente != null) { //busca por codigo do cliente
			for (Pedido p : this.listaPedidos) {
				if (p.getCliente().getCodigo().equals(codCliente)) {
					filtroPedidos.add(p);
				}
			}
			
			return filtroPedidos;
		}

		return this.listaPedidos; //retorna a lista vazia/nula
	}
	
	
	@GetMapping(path = "/pedidos/{codigo}/items") //mostra só os items do pedido
	public ResponseEntity<?> consultarItemsPedido(@PathVariable(name = "codigo") Integer codPedido) {
		
		Pedido produtoProcurado = null;
		
		for (Pedido p : this.listaPedidos) {
			if (codPedido.equals(p.getCodigo())) {
				produtoProcurado = p;
				break;
			}
		}
		
		if (produtoProcurado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("nao achou");
		} else {
			return ResponseEntity.ok(produtoProcurado.getItems());
		}
	}
	
	@DeleteMapping(path = "/pedidos/{codigo}") //deleta pedidos por codigo
	public ResponseEntity<?> deletarPedidosPorCodigo(@PathVariable(name = "codigo") Integer codPedido) {	
		
		for (Pedido p : this.listaPedidos) {
			if (codPedido.equals(p.getCodigo())) {
				this.listaPedidos.remove(p);
				return ResponseEntity.status(HttpStatus.OK).body("deletado");
			}
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("nao achou");
	}
	
}
