package com.unirriter.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    private Button welcomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeBtn = findViewById(R.id.welcomeBtn);
    }

    public void accessar(View view) {
        Intent myIntent = new Intent(Welcome.this, MainActivity.class);
        Welcome.this.startActivity(myIntent);
    }
}