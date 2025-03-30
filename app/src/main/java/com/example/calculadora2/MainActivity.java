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

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
   private int valor1 = -1, valor2 = -1;
    private String op = "";
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

        Button bt_0 = findViewById(R.id.bt_0);
        bt_0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                    op += '0';
                    resultado.getEditText().setText(op);

            }
        });
        Button bt_1 = findViewById(R.id.bt_1);
        bt_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '1';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '2';
                resultado.getEditText().setText(op);
            }
        });

        Button bt_3 = findViewById(R.id.bt_3);
        bt_3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '3';
                resultado.getEditText().setText(op);
            }
        });

        Button bt_4 = findViewById(R.id.bt_4);
        bt_4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '4';
                resultado.getEditText().setText(op);
            }
        });

        Button bt_5 = findViewById(R.id.bt_5);
        bt_5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '5';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_6 = findViewById(R.id.bt_6);
        bt_6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '6';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_7 = findViewById(R.id.bt_7);
        bt_7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '7';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_8 = findViewById(R.id.bt_8);
        bt_8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '8';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_9 = findViewById(R.id.bt_9);
        bt_9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += '9';
                resultado.getEditText().setText(op);
            }
        });
        Button bt_soma = findViewById(R.id.Soma);
        bt_soma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += " + ";
                resultado.getEditText().setText(op);
            }
        });

        Button bt_sub = findViewById(R.id.Sub);
        bt_sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += " - ";
                resultado.getEditText().setText(op);
            }
        });

        Button bt_mul = findViewById(R.id.Mul);
        bt_mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += " x ";
                resultado.getEditText().setText(op);
            }
        });

        Button bt_div = findViewById(R.id.Divi);
        bt_div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += " / ";
                resultado.getEditText().setText(op);
            }
        });

        Button bt_ponto = findViewById(R.id.bt_ponto);
        bt_ponto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += ".";
                resultado.getEditText().setText(op);
            }
        });
        Button bt_c = findViewById(R.id.bt_limpar);
        bt_c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op = "";
                resultado.getEditText().setText(op);
            }
        });
        Button bt_por = findViewById(R.id.bt_por);
        bt_por.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                op += " %";
                resultado.getEditText().setText(op);
            }
        });

        Button bt_igual = findViewById(R.id.bt_igual);
        bt_igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextInputLayout resultado = findViewById(R.id.textInput_A);
                double v1, v2, res = 0;
                if(op.contains("x")){
                    String[] parcelasMul = op.split(" ");
                    v1 = Double.parseDouble(parcelasMul[0]);
                    v2 = Double.parseDouble(parcelasMul[2]);
                    res = v1*v2;
                }
                if(op.contains("/")){
                    String[] parcelasMul = op.split(" ");
                    v1 = Double.parseDouble(parcelasMul[0]);
                    v2 = Double.parseDouble(parcelasMul[2]);
                    if(v2 == 0) {
                        resultado.getEditText().setText("ERROR");
                        return;
                    }
                    res = v1/v2;
                }
                if(op.contains("+")){
                    String[] parcelasMul = op.split(" ");
                    v1 = Double.parseDouble(parcelasMul[0]);
                    v2 = Double.parseDouble(parcelasMul[2]);
                    res = v1+v2;
                }
                if(op.contains("-")){
                    String[] parcelasMul = op.split(" ");
                    v1 = Integer.parseInt(parcelasMul[0]);
                    v2 = Integer.parseInt(parcelasMul[2]);
                    res = v1-v2;
                }
                if(op.contains("%")){
                    String[] parcelasMul = op.split(" ");
                    v1 = Integer.parseInt(parcelasMul[0]);
                    res = v1/100;
                }

                resultado.getEditText().setText(String.valueOf(res));
            }
        });
    }
}