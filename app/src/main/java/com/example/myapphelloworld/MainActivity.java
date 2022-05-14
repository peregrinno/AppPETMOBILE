package com.example.myapphelloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    EditText editTextEmailAddress, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, Channel 1)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle(textTitle)
                .setContentText(textContent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        */

        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    public void acessar(View view) {

        //Cria novo objeto da classe usuario
        Usuario user = new Usuario("joseluan74@gmail.com", 123456);

        String inputViewEmail = editTextEmailAddress.getText().toString();
        int inputViewSenha = Integer.parseInt(editTextPassword.getText().toString());

        if (inputViewEmail == user.getEmail() && inputViewSenha == user.getPassword()){
            System.out.println("Acesso liberado para: ");
            System.out.println(user.getEmail() + user.getPassword());
        } else {
            System.out.print("Credencias invalidas");
        }
    }
}