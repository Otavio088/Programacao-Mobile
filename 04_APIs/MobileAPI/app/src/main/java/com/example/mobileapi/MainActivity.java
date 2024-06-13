package com.example.mobileapi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoConcelho (View view) {
        TextView txtConselho = findViewById(R.id.textConselho);

        String url = "https://api.adviceslip.com/advice";

        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String Response) {
                        try {
                            JSONObject responseObject = new JSONObject(Response.toString());
                            JSONObject split = responseObject.getJSONObject("slip");
                            String advice = split.getString("advice");
                            String id = split.getString("id");

                            txtConselho.setText(id + "\n" + advice);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this,
                                error.getMessage(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
                );

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        request.setShouldCache(false);
        requestQueue.add(request);
    }

}