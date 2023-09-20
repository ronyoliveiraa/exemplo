package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber4;
    private EditText editTextNumber5;
    private EditText editTextNumber6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
    }
    public void somar(View view ) {
        int x, y, soma;
        x = Integer.parseInt(editTextNumber4.getText().toString());
        y = Integer.parseInt(editTextNumber5.getText().toString());
        soma = x + y;
        editTextNumber6.setText(Integer.toString(soma));


    }

}