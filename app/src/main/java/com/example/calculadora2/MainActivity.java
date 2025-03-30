package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bt_soma = findViewById(R.id.Soma);
        bt_soma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout valorA = findViewById(R.id.textInput_A);
                TextInputLayout valorB = findViewById(R.id.textInput_B);

                int vA =  Integer.parseInt(valorA.getEditText().getText().toString());
                int vB =  Integer.parseInt(valorB.getEditText().getText().toString());

                TextView resultado = findViewById(R.id.Resultado);

                int res = vA + vB;
                resultado.setText("O resultado é: " + String.valueOf(res));
            }
        });

        Button bt_sub = findViewById(R.id.Sub);
        bt_sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout valorA = findViewById(R.id.textInput_A);
                TextInputLayout valorB = findViewById(R.id.textInput_B);
                TextView resultado = findViewById(R.id.Resultado);

                int vA =  Integer.parseInt(valorA.getEditText().getText().toString());
                int vB =  Integer.parseInt(valorB.getEditText().getText().toString());

                int res = vA - vB;
                resultado.setText("O resultado é: " + String.valueOf(res));
            }
        });

        Button bt_mul = findViewById(R.id.Mul);
        bt_mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout valorA = findViewById(R.id.textInput_A);
                TextInputLayout valorB = findViewById(R.id.textInput_B);
                TextView resultado = findViewById(R.id.Resultado);

                int vA =  Integer.parseInt(valorA.getEditText().getText().toString());
                int vB =  Integer.parseInt(valorB.getEditText().getText().toString());

                int res = vA * vB;
                resultado.setText("O resultado é: " + String.valueOf(res));
            }
        });

        Button bt_div = findViewById(R.id.Divi);
        bt_div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout valorA = findViewById(R.id.textInput_A);
                TextInputLayout valorB = findViewById(R.id.textInput_B);
                TextView resultado = findViewById(R.id.Resultado);

                int vA =  Integer.parseInt(valorA.getEditText().getText().toString());
                int vB =  Integer.parseInt(valorB.getEditText().getText().toString());

                if(vB != 0) {
                    int res = vA / vB;

                    resultado.setText("O resultado é: " + String.valueOf(res));
                }else {
                    resultado.setText(" Não é possível fazer divisão por 0");
                }
            }
        });
    }
}