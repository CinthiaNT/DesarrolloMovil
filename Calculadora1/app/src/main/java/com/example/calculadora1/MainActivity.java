package com.example.calculadora1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtPantalla;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
    btnPunto,btnElimina,btnIgual,btnClear,btnMas,btnMenos,btnMultiplicacion,
    btnDivision,btnMasDecimales,btnMenosDecimales,btnGuardar,btnSubneteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPantalla = (EditText) findViewById(R.id.txtPantalla);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnElimina= (Button) findViewById(R.id.btnElimina);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMasDecimales = (Button) findViewById(R.id.btnMasDecimales);
        btnMenosDecimales = (Button) findViewById(R.id.btnMenosDecimales);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnSubneteo = (Button) findViewById(R.id.btnSubneteo);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn0:
                txtPantalla.setText(txtPantalla.getText().toString()+"0");
                break;
            case R.id.btn1:
                txtPantalla.setText(txtPantalla.getText().toString()+"1");
                break;
            case R.id.btn2:
                txtPantalla.setText(txtPantalla.getText().toString()+"2");
                break;
            case R.id.btn3:
                txtPantalla.setText(txtPantalla.getText().toString()+"3");
                break;
            case R.id.btn4:
                txtPantalla.setText(txtPantalla.getText().toString()+"4");
                break;
            case R.id.btn5:
                txtPantalla.setText(txtPantalla.getText().toString()+"5");
                break;
            case R.id.btn6:
                txtPantalla.setText(txtPantalla.getText().toString()+"6");
                break;
            case R.id.btn7:
                txtPantalla.setText(txtPantalla.getText().toString()+"7");
                break;
            case R.id.btn8:
                txtPantalla.setText(txtPantalla.getText().toString()+"8");
                break;
            case R.id.btn9:
                txtPantalla.setText(txtPantalla.getText().toString()+"9");
                break;
            case R.id.btnPunto:
                txtPantalla.setText(txtPantalla.getText().toString()+".");
                break;
            case R.id.btnIgual:
                txtPantalla.setText(txtPantalla.getText().toString()+"=");
                break;
            case R.id.btnClear:
                //txtPantalla.setText(txtPantalla.get);
                break;
            case R.id.btnMas:
                txtPantalla.setText(txtPantalla.getText().toString()+"+");
                break;
            case R.id.btnMenos:
                txtPantalla.setText(txtPantalla.getText().toString()+"-");
                break;
            case R.id.btnMultiplicacion:
                txtPantalla.setText(txtPantalla.getText().toString()+"x");
                break;
            case R.id.btnDivision:
                txtPantalla.setText(txtPantalla.getText().toString()+"/");
                break;
            case R.id.btnElimina:
                alerta("Elimino el  ultimo caracter");
                break;
            case R.id.btnMasDecimales:
                alerta("Se agregaron decimales");
                break;
            case R.id.btnMenosDecimales:
                alerta("Se eliminaron decimales");
                break;
            case R.id.btnGuardar:
                alerta("Se guardo el ultimo calculo");
                break;
            case R.id.btnSubneteo:
                alerta("Subneteo");
                break;
            }

    }
    public void alerta(String texto){
        Toast toast = Toast.makeText(
                getApplicationContext(),
                texto,
                Toast.LENGTH_LONG);
        toast.show();
    }

    private String [] separarCadena(String cadena) {
        String[] mascara = cadena.split("/");
        String[] octetos = mascara[0].split("[.]");
        String[] datos = new String[5];
        System.arraycopy(octetos, 0, datos, 0, 4);
        datos[4] = mascara[1];
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
        return octetos;
    }
    private boolean validarRango(int numero, int limiteInferior, int limiteSuperior){
        return numero >= limiteInferior && numero <= limiteSuperior;
    }

}
