package com.if3b.kanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etTulis;
    Button btnGO;
    TextView tvTulis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGO = findViewById(R.id.BTN_GO);
        etTulis = findViewById(R.id.ET_tulis);
        tvTulis = findViewById(R.id.TV_tulis);

        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tulis = etTulis.getText().toString();
                if (tulis.trim().equals(""))
                {
                    etTulis.setError("Harus DI ISI!!");
                }
                else {
                    tvTulis.setText(tulis);
                }
            }
        });


    }
}