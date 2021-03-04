package com.jomibusa.placetoplay.view;

import androidx.annotation.NonNull;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jomibusa.placetoplay.Interface.TransView;
import com.jomibusa.placetoplay.R;
import com.jomibusa.placetoplay.base.BaseActivity;
import com.jomibusa.placetoplay.modelo.interactor.GenerarPagosInteractor;
import com.jomibusa.placetoplay.presenter.GenerarPagosPresenter;


public class ContenedorGenerarPagos extends BaseActivity<GenerarPagosPresenter> implements TransView {

    EditText txtName, txtCorreo, txtCelular, txtNumTarjeta, txtMes, txtAnio, txtNumCVV;
    TextView txtCardName, cardNumber, txtCardMes, txtCardAnio;
    Button btnSiguiente, btnRegresar, btnEnviar, btnEliminar;
    LinearLayout contenedorInicial, contenedorTarjeta;


    @NonNull
    @Override
    protected GenerarPagosPresenter createPresenter(@NonNull Context context) {
        return new GenerarPagosPresenter(ContenedorGenerarPagos.this, new GenerarPagosInteractor());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_generar_pagos);

        initComponentes();

        btnSiguiente.setOnClickListener(v -> {
            String nombre = txtName.getText().toString();
            String correo = txtCorreo.getText().toString();
            String celular = txtCelular.getText().toString();
            mPresenter.realizarValidacion(nombre, correo, celular);
        });

        btnRegresar.setOnClickListener(v -> {
            contenedorTarjeta.setVisibility(View.GONE);
            contenedorInicial.setVisibility(View.VISIBLE);
        });

        btnEliminar.setOnClickListener(v -> {
            txtNumTarjeta.setText("");
        });

        escucharTarjeta();
        escucharMes();
        escucharAnio();

    }

    public void initComponentes() {
        txtName = findViewById(R.id.txtName);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtCelular = findViewById(R.id.txtCelular);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        contenedorInicial = findViewById(R.id.contenedorInicial);
        contenedorTarjeta = findViewById(R.id.contenedorTarjeta);
        btnRegresar = findViewById(R.id.btnRegresar);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtCardName = findViewById(R.id.txtCardName);
        cardNumber = findViewById(R.id.cardNumber);
        txtNumTarjeta = findViewById(R.id.txtNumTarjeta);
        btnEliminar = findViewById(R.id.btnEliminar);
        txtCardMes = findViewById(R.id.txtCardMes);
        txtCardAnio = findViewById(R.id.txtCardAnio);
        txtMes = findViewById(R.id.txtMes);
        txtAnio = findViewById(R.id.txtAnio);
        txtNumCVV = findViewById(R.id.txtNumCVV);
    }

    @Override
    public void showInfoCard() {
        contenedorInicial.setVisibility(View.GONE);
        contenedorTarjeta.setVisibility(View.VISIBLE);
        txtCardName.setText(txtName.getText());

    }

    @Override
    public void validarInfo(String campo) {
        switch (campo) {
            case "nombre":
                txtName.setError("El campo no puede ir en blanco");
                break;
            case "correo":
                txtCorreo.setError("El campo no puede ir en blanco");
                break;
            case "celular":
                txtCelular.setError("El campo no puede ir en blanco");
                break;
        }
    }

    public void escucharTarjeta() {
        txtNumTarjeta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                cardNumber.setText(txtNumTarjeta.getText());
                if(s.length() == 4 || s.length() ==11 || s.length() == 18 || s.length() == 25){
                    txtNumTarjeta.setText(txtNumTarjeta.getText() + "   ");
                    txtNumTarjeta.setSelection(txtNumTarjeta.getText().length());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void escucharMes(){
        txtMes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                txtCardMes.setText(txtMes.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void escucharAnio(){
        txtAnio.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                txtCardAnio.setText(txtAnio.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showValidacion() {

    }

    @Override
    public void showError() {

    }
}