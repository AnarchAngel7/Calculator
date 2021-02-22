package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    Angel D'costa S076
     */
    
    Button b1, b2, b3, b4;
    EditText t1, t2;
    int num1, num2, add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        t1 = findViewById(R.id.num1);
        t2 = findViewById(R.id.num2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(t1.getText()));
                num2 = Integer.parseInt(String.valueOf(t2.getText()));
                add = num1 + num2;
                Toast.makeText(getApplicationContext(), "Addition = " + add, Toast.LENGTH_LONG).show();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(t1.getText()));
                num2 = Integer.parseInt(String.valueOf(t2.getText()));
                sub = num1 - num2;
                Toast.makeText(getApplicationContext(), "Subtraction = " + sub, Toast.LENGTH_LONG).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(t1.getText()));
                num2 = Integer.parseInt(String.valueOf(t2.getText()));
                mult = num1 * num2;
                Toast.makeText(getApplicationContext(), "Multiplication = " + mult, Toast.LENGTH_LONG).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(t1.getText()));
                num2 = Integer.parseInt(String.valueOf(t2.getText()));
                div = num1 / num2;
                Toast.makeText(getApplicationContext(), "Division = " + div, Toast.LENGTH_LONG).show();
            }
        });
    }
}