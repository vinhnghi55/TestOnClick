package com.example.testonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnResult;
    private EditText etNumberA;
    private EditText etNumberB;
    private int numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = findViewById(R.id.btn_Result);
        etNumberA = findViewById(R.id.et_numberA);
        etNumberB = findViewById(R.id.et_numberB);

        btnResult.setOnClickListener(this);

//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!etNumberA.getText().toString().isEmpty() && !etNumberB.getText().toString().isEmpty()) {
//                    numberA = Integer.parseInt(etNumberA.getText().toString());
//                    numberB = Integer.parseInt(etNumberB.getText().toString());
//
//                    Toast.makeText(
//                            MainActivity.this,
//                            "Result: " + numberA + " + " + numberB + " = " + (numberA + numberB),
//                            Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this,
//                            "Please write the number", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "This is OnLongClickListener", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Result:
                if (!etNumberA.getText().toString().isEmpty() && !etNumberB.getText().toString().isEmpty()) {
                    numberA = Integer.parseInt(etNumberA.getText().toString());
                    numberB = Integer.parseInt(etNumberB.getText().toString());

                    Toast.makeText(
                            MainActivity.this,
                            "Result: " + numberA + " + " + numberB + " = " + (numberA + numberB),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Please write the number", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
