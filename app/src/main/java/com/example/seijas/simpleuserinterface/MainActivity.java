package com.example.seijas.simpleuserinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void unaTostada(View v){

        EditText cuadro1 = (EditText) findViewById(R.id.editText);
        String mensaje = cuadro1.getText().toString();
        //La siguiente linea equivale a las dos anteriores (como se hizo en clase)
        String prueba = ((EditText) findViewById(R.id.editText)).getText().toString();

        Toast.makeText(getApplicationContext(), "Mensaje enviando: " + prueba, Toast.LENGTH_LONG).show();

    }


}