package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText number;
    EditText rows;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv);
        number = (EditText) findViewById(R.id.number);
        rows = (EditText) findViewById(R.id.rows);
        button = (Button) findViewById(R.id.btn_calculate);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                table();
            }
        });
    }
    protected void table()
    {
        int num = Integer.parseInt(number.getText().toString().trim());
        int row = Integer.parseInt(rows.getText().toString().trim());

        for(int i = 1; i <= row; i++)
        {
            String result = num + " x " + i + " = " + i*num + "\n";
            textView.append(result);
        }
    }
}