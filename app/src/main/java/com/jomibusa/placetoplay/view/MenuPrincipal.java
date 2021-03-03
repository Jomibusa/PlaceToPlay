package com.jomibusa.placetoplay.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.snackbar.Snackbar;
import com.jomibusa.placetoplay.R;

public class MenuPrincipal extends AppCompatActivity {

    CardView cardGenerarPagos, cardVisualizarPagos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_principal);

        cardGenerarPagos = findViewById(R.id.cardGenerarPagos);
        cardVisualizarPagos = findViewById(R.id.cardVisualizarPagos);

        cardGenerarPagos.setOnClickListener(v -> {
            startActivity(new Intent(MenuPrincipal.this, ContenedorGenerarPagos.class));
            /*Snackbar.make(v, "Esta opción se encuentra en desarrollo...", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();*/
        });

        cardVisualizarPagos.setOnClickListener(v -> {
            Snackbar.make(v, "Esta opción se encuentra en desarrollo...", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show();
        });
    }
}