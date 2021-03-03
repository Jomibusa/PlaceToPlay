package com.jomibusa.placetoplay.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jomibusa.placetoplay.R;

public class MainActivity extends AppCompatActivity {

    EditText editUsuario, editPassword;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario = findViewById(R.id.editUsuario);
        editPassword = findViewById(R.id.editPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(v -> {

            /*String email = editUsuario.getText().toString();
            String pass = editPassword.getText().toString();

            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                editUsuario.setError("Correo no válido!");
                editUsuario.setFocusable(true);
            }else if(pass.length() < 6){
                editPassword.setError("Contraseña debe ser mayor a 6!");
                editPassword.setFocusable(true);
            }else{
                InicioSesion(email, pass);
            }*/

            Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
            startActivity(intent);

        });

    }

    public void InicioSesion(String email, String pass){
        if(email.equals("jose@gmail.com") && pass.equals("jose12345")){
            Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this,"Usuario o Password incorrectos!!", Toast.LENGTH_SHORT).show();
        }
    }
}