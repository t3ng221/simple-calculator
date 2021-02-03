package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText num1EditText,num2EditText;
    TextView resultTextView;
    Button resultButton;
    char symbol;
    int num1,num2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1EditText=findViewById(R.id.firstEditTextID);
        num2EditText=findViewById(R.id.secondEditTextID);
        resultButton=findViewById(R.id.resultButtonID);

    }




    public void buttonFunction(View view) {

        if(view.getId()==R.id.addButtonID)
        {
            symbol='+';
        }
        else if(view.getId()==R.id.subButtonID)
        {
            symbol='-';
        }
        else if(view.getId()==R.id.multiButtonID)
        {
            symbol='*';
        }
        else
        {
            symbol='/';
        }
        resultTextView.setText("Result ="+result);
    }
    public void resultFunction(View view) {

        num1=Integer.parseInt(num1EditText.getText().toString());
        num2=Integer.parseInt(num2EditText.getText().toString());

        if(symbol=='+')
        {
            result=num1+num2;
        }
       else if(symbol=='-')
        {
            result=num1-num2;
        }
        else if(symbol=='*')
        {
            result=num1*num2;
        }
        else
        {
            result=num1/num2;
        }
        resultButton.setText("Result = "+result);

    }
}

//    public void subfunction(View view) {
//        int num1,num2,result;
//        num1=Integer.parseInt(num1EditText.getText().toString());
//        num2=Integer.parseInt(num2EditText.getText().toString());
//        result=num1-num2;
//        resultTextView.setText("Result ="+result);
//    }
//
//    public void multiFunction(View view) {
//        int num1,num2,result;
//        num1=Integer.parseInt(num1EditText.getText().toString());
//        num2=Integer.parseInt(num2EditText.getText().toString());
//        result=num1*num2;
//        resultTextView.setText("Result ="+result);
//    }
//
//    public void divFunction(View view) {
//        int num1,num2,result;
//        num1=Integer.parseInt(num1EditText.getText().toString());
//        num2=Integer.parseInt(num2EditText.getText().toString());
//        result=num1/num2;
//        resultTextView.setText("Result ="+result);
//    }
