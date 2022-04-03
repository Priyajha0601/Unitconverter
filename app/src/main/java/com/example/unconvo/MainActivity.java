package com.example.unconvo;

import
        androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText n1;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 =  findViewById(R.id.n1);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"converted successfully",Toast.LENGTH_SHORT);
                float i = (float) (Integer.parseInt(n1.getText().toString())*2.20462);
                textView.setText("The weight in pound is "+i);
            }
        });
    }
}