package com.unirriter.cadastro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Sistema extends AppCompatActivity {

    private Button cadastraBtn;
    private EditText nomeInput;
    private EditText dataInput;
    private EditText cpfInput;
    private RadioButton mascRadio;
    private RadioButton femRadio;
    private RadioGroup radioGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema);
    }

    public void cadastra(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aluno Cadastrado com Sucesso");
        builder.setMessage("Seus dados foram enviados e em alguns meses (ou até anos) estarão disponíveis para consulta.");
        builder.setPositiveButton("Concluir", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}