package com.vadinursezer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText1;
    EditText numberText2;
    TextView resultText;
    Button sum;
    Button deduct;
    Button multiply;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText1 = findViewById(R.id.numberText1);
        numberText2= findViewById(R.id.numberText2);
        resultText=findViewById(R.id.resultText);




    }


    public void sum(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");


        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 + number2;


            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }


    }

    public void deduct(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");


        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void multiply(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");


        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void divide(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");


        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }


}


