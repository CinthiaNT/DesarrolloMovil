package com.example.accesovista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private EditText inp_numero;
    private Button btn_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculando input
        inp_numero = (EditText) findViewById(R.id.inp_numero);
        //fijar texto
        inp_numero.setText("123456");
    }

    public void boton_presionado(View view){
        //leyendo contenido de input
        String texto = inp_numero.getText().toString();
        //desplegar mensaje emergente
        Toast toast = Toast.makeText(getApplicationContext(),texto, Toast.LENGTH_LONG);
        toast.show();

    }
}
