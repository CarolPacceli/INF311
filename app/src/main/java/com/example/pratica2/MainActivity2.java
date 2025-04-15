package com.example.pratica2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv_name = findViewById(R.id.tv_np_name);
        TextView tv_imc = findViewById(R.id.tv_np_imc);
        TextView tv_age = findViewById(R.id.tv_np_age);
        TextView tv_weight = findViewById(R.id.tv_np_weight);
        TextView tv_height = findViewById(R.id.tv_np_height);
        TextView tv_classification = findViewById(R.id.tv_np_classification);
        Bundle nr_informations = getIntent().getExtras();
        if(nr_informations != null) {
            tv_name.setText(nr_informations.getString("name"));
            tv_age.setText(nr_informations.getString("age"));
            tv_weight.setText(nr_informations.getString("weight"));
            tv_height.setText(nr_informations.getString("height"));
            tv_imc.setText(nr_informations.getString("imc"));
            tv_classification.setText(nr_informations.getString("classification"));
        }
        Button btn_calculate_imc = findViewById(R.id.btn_generate_new_imc);
        btn_calculate_imc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nutritional_report_intent = new Intent(MainActivity2.this,MainActivity.class);
                nutritional_report_intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(nutritional_report_intent);


            }
        });
    }

}