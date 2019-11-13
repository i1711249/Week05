package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume(); //Este codigo se ejecuta antes de todos.
        // en este punto la aplicacion ya cargo.
        // this en un activity: es la escencia de una pantalla
        // this es del tipo contexto

        Toast.makeText(this, "Aplicacion Iniciada", Toast.LENGTH_LONG).show();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Toast.makeText(this, "Aplicacion Stopeada", Toast.LENGTH_LONG).show();

    }
}
