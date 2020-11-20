package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    private LocationManager locationManager;
    private LocationListener locationListener;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.login);

    }

    public void irParaCadastro (View view){
        startActivity(new Intent(this, NovoUsuarioActivity.class));
    }

    public void fazerLogin (View view){

    }

}