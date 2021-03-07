package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private TextView viewResult;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.Text1);
        text2 = findViewById(R.id.Text2);
        viewResult = findViewById(R.id.viewResult);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
//            printLn('qwerty12')
//            @Override
            public void onClick(View v) {
                if (text1.getText().toString().length() == 0) {
                    text1.setText("0");
                }
                if (text2.getText().toString().length() == 0) {
                    text2.setText("0");
                }
                int num1 = Integer.parseInt(text1.getText().toString());
                int num2 = Integer.parseInt(text2.getText().toString());
                int sum = num1 + num2;
                viewResult.setText(String.valueOf(sum));
            }
        });
    }
}