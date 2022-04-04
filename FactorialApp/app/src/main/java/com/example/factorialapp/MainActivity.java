package com.example.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button cal;
    private TextView textView;
    private EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.editText);
        cal = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewpri) {
                int num = Integer.parseInt(text.getText().toString());
                factorial(num);
            }
        });
    }
    private void factorial(double num){
        int fact=1, i;
        for (i=1;i<=num;i++){
            fact = fact*i;
        }
        textView.setText("Factorial is: "+fact);
    }
}