package com.vadinursezer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
// FIXME kararsız developer diyorum ben kullanılmayan bir import görünce :)
import android.text.Editable;
import android.view.View;
// FIXME kararsız developer diyorum ben kullanılmayan bir import görünce :)
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.numberText1) EditText numberText1;
    @BindView(R.id.numberText2) EditText numberText2;
    @BindView(R.id.resultText)  TextView resultText;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    public void sum(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText(R.string.result);
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 + number2;

            String resultString = getResources().getString(R.string.result, result);
            resultText.setText(resultString);
            numberText1.setText("");
            numberText2.setText("");
        }
    }

    // FIXME ) { veya ){ seç birini :)
    public void deduct(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText(R.string.result);
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 - number2;

            resultText.setText(R.string.result);
            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void multiply(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText(R.string.result);
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 * number2;

            resultText.setText(R.string.result);
            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void divide(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            resultText.setText(R.string.result);
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 / number2;

            resultText.setText(R.string.result);
            numberText1.setText("");
            numberText2.setText("");
        }
    }
}


