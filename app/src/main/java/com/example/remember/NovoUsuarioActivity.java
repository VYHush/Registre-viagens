package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NovoUsuarioActivity extends AppCompatActivity {

    private EditText loginNovoUsuarioEditText;
    private EditText senhaNovoUsuarioEditText;
    private FirebaseAuth

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        loginNovoUsuarioEditText = findViewById(R.id.loginNovoUsuarioEditText);
        senhaNovoUsuarioEditText = findViewById(R.id.senhaNovoUsuarioEditText);
        auth = FirebaseAuth.getInstance();
    }

    public void criarNovoUsuario (View view){
        String login = loginNovoUsuarioEditText.getEditableText().toString();
        String senha = senhaNovoUsuarioEditText.getEditableText().toString();
        auth.creatUserWithEmailAndPassword(login, senha).addOnSuccessListener((result) -> {
            Toast.makeText(this, result.getUser().getEmail(), Toast.LENGTH_SHORT).show();
            finish();
        }).addOnFailureListener((error -> error.printStackTrace()));
    }
}