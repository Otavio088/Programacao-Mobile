package edu.fatec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.model.Cliente;

@RestController
public class ClienteController {
	
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	@PostMapping(path = "/clientes") //cadastrar clientes 
	public ResponseEntity<?> cadastrarCliente(@RequestBody Cliente cliente) {
		for (Cliente c : listaClientes) {
			if (c.getEmail().equals(cliente.getEmail())) {
				return ResponseEntity.status(HttpStatus.CONFLICT).body("Cliente já existe!");
			}
		}
		
		Integer codigo = (int) (Math.random() * 1000);
		
		cliente.setCodigo(codigo);
		
		//salva lista na memoria
		this.listaClientes.add(cliente);
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(cliente);
	}
	
//	@GetMapping(path = "/clientes") //consulta todos os clientes
//	public List<Cliente> consultarCliente() {
//
//		return this.listaClientes;
//	}
	
	@GetMapping(path = "/clientes/{id}") //consulta determinado consulta
	public ResponseEntity<?> consultarClientePorId(@PathVariable(name = "id") Integer codigo) {
		Cliente clienteProcurado = null;
		
		for (Cliente c : this.listaClientes) {
			if (codigo.equals(c.getCodigo())) {
				clienteProcurado = c;
			}
		}
		
		if (clienteProcurado == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			return ResponseEntity.ok(clienteProcurado);
		}
	}
	
	@GetMapping(path = "/clientes")
	public List<Cliente> consutarClientePorNome(@RequestParam(name = "nome", required = false) String nome) {
		List<Cliente> filtro = new ArrayList<Cliente>();
		
		if (nome != null && !nome.isEmpty()) {
			for (Cliente c : this.listaClientes) {
				if (c.getNome().contains(nome)) {
					filtro.add(c);
				}
			}
			
			return filtro;
		}
		
		return this.listaClientes;
	}
	
	@DeleteMapping(path = "/clientes/{id}") //deletar cliente
	public ResponseEntity<?> deletarClientePorId(@PathVariable(name = "id") Integer codigo) {
		
		for (Cliente c : this.listaClientes) {
			if (c.getCodigo().equals(codigo)) {
				this.listaClientes.remove(c);
				return ResponseEntity.status(HttpStatus.OK).body("removeu");
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("nao achou");
	}
	
	@PutMapping(path = "/clientes/{id}")
	public ResponseEntity<?> alterarClientePorId(@PathVariable(name = "id") Integer codigo, @RequestBody Cliente cliente) {
		
		for (Cliente c : this.listaClientes) {
			if (c.getCodigo().equals(codigo)) {
				c.setEmail(cliente.getEmail());
				c.setNome(cliente.getNome());
				
				return ResponseEntity.status(HttpStatus.OK).body(c);
			}
		}
		
		return null;
	}
	
}
