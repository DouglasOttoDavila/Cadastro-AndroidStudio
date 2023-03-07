package com.unirriter.cadastro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn;
    private EditText inputUser;
    private EditText inputSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn = findViewById(R.id.loginBtn);
        inputUser = findViewById(R.id.inputUser);
        inputSenha = findViewById(R.id.inputSenha);
    }

    public void login(View view) {
        String user = String.valueOf(inputUser.getText());
        String senha = String.valueOf(inputSenha.getText());
        Log.d(user,user);
        Log.d(senha,senha);

        if (inputUser.getText().toString().equals("admin") && inputSenha.getText().toString().equals("admin")) {
            Intent intent = new Intent(this, Sistema.class);
            startActivity(intent);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Não foi possível acessar");
            builder.setMessage("Usuário ou senha estão incorretos. Por favor tente novamente.");
            builder.setPositiveButton("Tentar novamente", null);
            AlertDialog dialog = builder.create();
            dialog.show();
        }

        /*if ( user != "admin") {
            Intent myIntent = new Intent(MainActivity.this, Welcome.class);
            MainActivity.this.startActivity(myIntent);
            Log.d("Input user:" + user,user);
            Log.d("Input senha:" + senha,senha);
        } else {
            Intent myIntent = new Intent(MainActivity.this, Sistema.class);
            MainActivity.this.startActivity(myIntent);
            Log.d("User is: " + user,user);
            Log.d("Senha is: " + senha,senha);
        }*/

    }
}