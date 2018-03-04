package com.isabel.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Tvista;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmas,bmenos,bigual,bmulti,bdiv,bpunto;
    float valor = 0,valor1 = 0,valor2 = 0,resultado;
    String Svalue = "",t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvista = findViewById(R.id.vista);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);

        bmas = findViewById(R.id.bmas);
        bmenos = findViewById(R.id.bmenos);
        bigual = findViewById(R.id.bigual);
        bmulti = findViewById(R.id.bmulti);
        bdiv = findViewById(R.id.bdiv);
        bpunto = findViewById(R.id.bpunto);
    }

    public void siete(View view) {
        Svalue += "7";  //
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void ocho(View view) {
        Svalue += "8";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void nueve(View view) {
        Svalue += "9";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void cuatro(View view) {
        Svalue += "4";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void cinco(View view) {
        Svalue += "5";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void seis(View view) {
        Svalue += "6";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void uno(View view) {
        Svalue += "1";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void dos(View view) {
        Svalue += "2";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void tres(View view) {
        Svalue += "3";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }

    public void punto(View view) {
        Svalue += ".";
        Tvista.setText(Svalue);
    }

    public void cero(View view) {
        Svalue += "0";
        Tvista.setText(Svalue);
        valor = Float.parseFloat(Svalue);
    }
    public void mas(View view) {
        Svalue = "";
        Tvista.setText(null);
        valor1 = valor;
        t = "suma";

    }
    public void menos(View view) {
        Svalue = "";
        valor1 = valor;
        t = "resta";
    }

    public void multiplicacion(View view) {
        Svalue = "";
        valor1 = valor;
        t = "multi";
    }

    public void division(View view) {
        Svalue = "";
        valor1 = valor;
        t = "division";
    }

    public void borrar(View view) {
        Tvista.setText(null);
        valor = 0;
        valor1 = 0;
        valor2 = 0;
        t = "";
        Svalue = "";

    }

    public void igual(View view) {

        int id = view.getId();

        if(id == R.id.bigual){
            if(Svalue.isEmpty() ){
                Tvista.setText("No hay valores");
            }

            else{
                valor2 = valor;

                switch (t){
                    case "suma":
                        resultado = valor1 + valor2;
                        Tvista.setText(Float.toString(resultado));
                        break;
                    case "resta":
                        resultado = valor1-valor2;
                        Tvista.setText(Float.toString(resultado));
                        break;
                    case "multi":
                        resultado = valor1*valor2;
                        Tvista.setText(Float.toString(resultado));
                        break;
                    case "division" :
                        resultado = valor1/valor2;
                        Tvista.setText(Float.toString(resultado));
                        break;
                }
            }

        }

    }

}
