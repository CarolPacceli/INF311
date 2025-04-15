package com.example.pratica2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

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

        Button btn_calculate_imc = findViewById(R.id.btn_calculate_imc);
        btn_calculate_imc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText et_weight = findViewById(R.id.et_weight);
                EditText et_height = findViewById(R.id.et_height);

                double imc = Double.parseDouble(et_weight.getText().toString()) / (Double.parseDouble(et_height.getText().toString()) * Double.parseDouble(et_height.getText().toString()));
                DecimalFormat frm_imc = new DecimalFormat("#.00");
                String classification = "";
                EditText et_name = findViewById(R.id.et_name);
                EditText et_age = findViewById(R.id.et_age);
                    if( imc < 18.5)
                        classification = "Abaixo do Peso";
                    else if( imc >= 18.5 && imc < 25)
                        classification = "Saudável";
                        
                    else if( imc >= 25 && imc < 30)
                        classification = "Sobrepeso";
                        
                    else if( imc >= 30 && imc < 35)
                        classification = "Obesidade Grau I";
                        
                    else if( imc >= 35 && imc < 40)
                        classification = "Obesidade Grau II (severa)";
                        
                    else if( imc >= 40)
                        classification = "Obesidade Grau III (mórbida)";
                    
                Intent nutritional_report_intent = new Intent(MainActivity.this,MainActivity2.class);
                nutritional_report_intent.putExtra("name",et_name.getText().toString());
                nutritional_report_intent.putExtra("age",et_age.getText().toString());
                nutritional_report_intent.putExtra("weight",et_weight.getText().toString());
                nutritional_report_intent.putExtra("height",et_height.getText().toString());
                nutritional_report_intent.putExtra("imc", String.valueOf(frm_imc.format(imc)));
                nutritional_report_intent.putExtra("classification", classification);
                startActivity(nutritional_report_intent);


            }
        });
    }
}