package com.example.evenodd_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //    Variable Declaration
    Button check;
    EditText num;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  Fetch and fill variable
        num = findViewById(R.id.editText1);
        check = findViewById(R.id.button);
        res = findViewById(R.id.textViewAns);
//  When button is clicked
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Convert to string
                int number = Integer.parseInt(num.getText().toString());
//                Even Odd Logic
                if (number % 2 == 0){
                    res.setText(number + " is even");
                }
                else {
                    res.setText(number + " is odd");
                }
            }
        });
    }
}