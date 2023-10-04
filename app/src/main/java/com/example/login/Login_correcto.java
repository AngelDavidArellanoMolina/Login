package com.example.login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_correcto extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_correcto);

        TextView texto = findViewById(R.id.result_set);
        String user = getIntent().getStringExtra("USER");

        texto.setText("Bienvenido @" + user);
    }
}
