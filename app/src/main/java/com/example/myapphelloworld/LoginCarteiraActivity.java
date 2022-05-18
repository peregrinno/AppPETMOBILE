package com.example.myapphelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class LoginCarteiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_carteira);

        String mensagem = "Olá, Luan";
        TextView editText = (TextView) findViewById(R.id.textViewSaudacao);
        editText.setText(mensagem);

        Button button =findViewById(R.id.btnback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}