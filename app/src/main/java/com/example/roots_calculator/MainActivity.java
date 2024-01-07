package com.example.roots_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    private EditText A_VAL , B_VAL , C_VAL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView4);
        A_VAL  = findViewById(R.id.editTextNumberSigned);
        B_VAL = findViewById(R.id.editTextNumberSigned2);
        C_VAL = findViewById(R.id.editTextNumberSigned3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String A= A_VAL.getText().toString();
                String B= B_VAL.getText().toString();
                String C= C_VAL.getText().toString();
                double a = Integer.parseInt(A);
                double b = Integer.parseInt(B);
                double c = Integer.parseInt(C);
                ;

                double delta = b*b - 4*a*c;
                if(delta <0)
                {
                    textView.setText("IMAGINARY ROOTS");
                    Toast.makeText(MainActivity.this, "CONVERSION DONE SUCESSFULLY", Toast.LENGTH_SHORT).show();
                }

                else if(delta ==0)
                {
                    double roots = -b/(2*a);
                    textView.setText("ROOTS ARE " + roots);
                    Toast.makeText(MainActivity.this, "CONVERSION DONE SUCESSFULLY", Toast.LENGTH_SHORT).show();
                }
                else if(delta >0)
                {
                    double adder2 = Math.pow(delta , 0.5)/(2*a);
                    double adder1 = -b/(2*a);

                    double root1 = adder1+adder2;
                    double root2 = adder1- adder2;
                    textView.setText("ROOTS ARE " + root1 + " AND " + root2);
                    Toast.makeText(MainActivity.this, "CONVERSION DONE SUCESSFULLY", Toast.LENGTH_SHORT).show();

                }




            }
        });


    }
}