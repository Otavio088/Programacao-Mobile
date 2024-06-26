package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


public class InstituicoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instituicoes);

        mostrarAPI();
    }

    public void voltarMenu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    public void mostrarAPI() {
        final TextView resultados = /*(TextView)*/ findViewById(R.id.idTxtAPI);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://demo3766274.mockable.io/faculdades";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        resultados.setText("Response is: " + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resultados.setText("Erro: " + error.toString());
            }
        });

        queue.add(stringRequest);
    }

}