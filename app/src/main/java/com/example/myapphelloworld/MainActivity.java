package com.example.myapphelloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editTextEmailAddress, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    private void MensagemInformativa (String mensagem){
        new AlertDialog.Builder(this)
                .setTitle("Algo errado...")
                .setMessage(mensagem)
                .setPositiveButton("OK", null)
                .setCancelable(false)
                .show();
    }

    public void Login(View view){
        Button button = findViewById(R.id.btnUserLogin);
        Usuario user = new Usuario();
        user.setEmail(editTextEmailAddress.getText().toString());
        user.setPassword(editTextPassword.getText().toString());

        if (user.ValidaUsuario() == false){
            MensagemInformativa("Email ou senha inválidos, tente novamente.");
        } else {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, LoginCarteiraActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

}