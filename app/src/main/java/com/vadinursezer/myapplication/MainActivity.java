package com.vadinursezer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
// FIXME kararsız developer diyorum ben kullanılmayan bir import görünce :)
import android.text.Editable;
import android.view.View;
// FIXME kararsız developer diyorum ben kullanılmayan bir import görünce :)
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // FIXME Butterknife ile okumak daha tatlı olur https://github.com/JakeWharton/butterknife
    // FIXME @BindView(R.id.numberText1)
    EditText numberText1;

    // FIXME @BindView(R.id.numberText2)
    EditText numberText2;

    // FIXME @BindView(R.id.resultText)
    TextView resultText;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FIXME Butterknife olunca bu satıra gerek kalmayacak
        numberText1 = findViewById(R.id.numberText1);
        // FIXME Butterknife olunca bu satıra gerek kalmayacak
        numberText2= findViewById(R.id.numberText2);
        // FIXME Butterknife olunca bu satıra gerek kalmayacak
        resultText=findViewById(R.id.resultText);
        // FIXME Burada fazladan bir boşluk var :D ben azarlıyorum benim çömezler böyle fazla boşluk koyunca
        // FIXME Burada fazladan bir boşluk var
        // FIXME Burada fazladan bir boşluk var
        // FIXME Burada fazladan bir boşluk var
    }

    // FIXME Tutarsızlık var bir üstteki function da ...State) { ama burda ...view){
    // FIXME ) { veya ){ seç birini :)
    public void sum(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            // FIXME r.strings 'den okumak tatlı olurdu
            resultText.setText("Enter Number!");
            // FIXME Burada fazladan bir boşluk var
            // FIXME Burada fazladan bir boşluk var
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 + number2;
            // FIXME Burada fazladan bir boşluk var
            // FIXME String format çok hoş bişey :) https://stackoverflow.com/a/20887690
            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
        // FIXME Burada fazladan bir boşluk var
        // FIXME Burada fazladan bir boşluk var
    }

    // FIXME ) { veya ){ seç birini :)
    public void deduct(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            // FIXME r.strings 'den okumak tatlı olurdu
            resultText.setText("Enter Number!");
            // FIXME Burada fazladan bir boşluk var
            // FIXME Burada fazladan bir boşluk var
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 - number2;
            // FIXME String format çok hoş bişey :) https://stackoverflow.com/a/20887690
            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void multiply(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            // FIXME r.strings 'den okumak tatlı olurdu
            resultText.setText("Enter Number!");
            // FIXME Burada fazladan bir boşluk var
            // FIXME Burada fazladan bir boşluk var
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 * number2;
            // FIXME String format çok hoş bişey :) https://stackoverflow.com/a/20887690
            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }

    public void divide(View view){

        if(numberText1.getText().toString() .matches("") || numberText2.getText().toString().matches("")){
            // FIXME r.strings 'den okumak tatlı olurdu
            resultText.setText("Enter Number!");
            // FIXME Burada fazladan bir boşluk var
            // FIXME Burada fazladan bir boşluk var
        } else {

            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 / number2;
            // FIXME String format çok hoş bişey :) https://stackoverflow.com/a/20887690
            resultText.setText("Result: " + result);

            numberText1.setText("");
            numberText2.setText("");
        }
    }
    // FIXME Burada fazladan bir boşluk var
    // FIXME Burada fazladan bir boşluk var
}


