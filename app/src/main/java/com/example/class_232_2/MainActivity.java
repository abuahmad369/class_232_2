package com.example.class_232_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edInput;
    Button button;
    TextView tvDisplay;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edInput = findViewById(R.id.edInput);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText("");

                int input = Integer.parseInt(edInput.getText().toString());

                for(int i=1; i<=input; i++)
                {
                    if(i%2 == 0){

                        sum = sum + i;
                    }
                    tvDisplay.append(" "+i);
                }

                tvDisplay.append("\n");
                tvDisplay.append("Sum is: "+sum);
            }
        });
    }
}