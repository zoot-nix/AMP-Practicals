package com.example.largestofthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private Button cal;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.editText1);
        num2 = (EditText)findViewById(R.id.editText2);
        num3 = (EditText)findViewById(R.id.editText3);
        cal = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = Integer.parseInt(num3.getText().toString());
                greatest(a, b, c);
            }
        });
    }
    private void greatest(int a, int b, int c){
        int largest;
        if (a>=b && a>=c){
            largest = a;
        }
        else if (b>=a && b>=c){
            largest = b;
        }
        else {
            largest = c;
        }
        textView.setText("Largest number is: "+largest);
    }
}