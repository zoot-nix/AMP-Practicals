package com.example.evenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button compare;
    private EditText num;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText)findViewById(R.id.editText1);
        compare = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(num.getText().toString());
                check(number);
            }
        });
    }
    private void check(int number){
        if (number % 2 == 0){
            textView.setText(number + " is even");
        }
        else{
            textView.setText(number + " is odd");
        }
    }
}