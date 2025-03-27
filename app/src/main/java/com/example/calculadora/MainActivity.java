package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText desde1;
    private EditText desde2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        desde1 = findViewById(R.id.desde1);
        desde2 = findViewById(R.id.desde2);
        resultado = findViewById(R.id.resultado);
    }

    public void soma(View view)
    {
        float valor1 = Integer.parseInt(desde1.getText().toString());
        float valor2 = Integer.parseInt(desde2.getText().toString());
        resultado.setText(String.valueOf(valor1 + valor2));
    }

    public void subtracao(View view)
    {
        float valor1 = Integer.parseInt(desde1.getText().toString());
        float valor2 = Integer.parseInt(desde2.getText().toString());
        resultado.setText(String.valueOf(valor1 - valor2));
    }

    public void vezes(View view)
    {
        float valor1 = Integer.parseInt(desde1.getText().toString());
        float valor2 = Integer.parseInt(desde2.getText().toString());
        resultado.setText(String.valueOf(valor1 * valor2));
    }

    public void dividir(View view)
    {
        float valor1 = Integer.parseInt(desde1.getText().toString());
        float valor2 = Integer.parseInt(desde2.getText().toString());
        if(valor1 == 0)
        {
            resultado.setText("Não é possivel dividir 0");
        }else if(valor2 == 0)
        {
            resultado.setText("Não é possivel dividir por 0");

        }else
        {
            resultado.setText(String.valueOf(valor1 / valor2));
        }
    }




}0