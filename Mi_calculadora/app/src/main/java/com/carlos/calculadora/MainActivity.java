package com.carlos.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText base, altura;
    TextView resultado;
    Button calculo;

    float operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = findViewById(R.id.sideOne);
        altura = findViewById(R.id.sideTwo);
        resultado = findViewById(R.id.resultado);
        calculo = findViewById(R.id.Calcular);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valueOne = Float.parseFloat(base.getText().toString());
                float valueTwo = Float.parseFloat(altura.getText().toString());
                operacion = ((valueOne*valueTwo)/2);
                resultado.setText("El resultado es " + String.valueOf(operacion));
            }
        });

    }
}