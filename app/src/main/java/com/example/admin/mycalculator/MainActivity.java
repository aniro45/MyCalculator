package com.example.admin.mycalculator;

import android.inputmethodservice.KeyboardView;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

             public void PlusButtonClicked(View view){
            EditText num1 = (EditText) findViewById(R.id.Num1EditTextId);
            EditText num2 = (EditText) findViewById(R.id.Num2EditTextId);
            TextView result = (TextView) findViewById(R.id.ResultedTextViewId);
                 Button digit1button = (Button) findViewById(R.id.Didgit1ButtonId);
            double x =Double.parseDouble(num1.getText().toString());
            double y = Double.parseDouble((num2.getText().toString()));
            double Result = x+y;
            result.setText(Result +"");
                 Toast.makeText(this, "burrhh...!!!Added Successfully", Toast.LENGTH_SHORT).show();
    }

    public void MultiplyButtonClicked(View view){
        EditText num1 = (EditText) findViewById(R.id.Num1EditTextId);
        EditText num2 = (EditText) findViewById(R.id.Num2EditTextId);
        TextView result = (TextView) findViewById(R.id.ResultedTextViewId);

        double x =Double.parseDouble(num1.getText().toString());
        double y = Double.parseDouble((num2.getText().toString()));
        double Result = x*y;
        result.setText(Result +"");
        Toast.makeText(this, "burrhh...!!!Multiplied Successfully", Toast.LENGTH_SHORT).show();
    }

    public void SubtractButtonClicked(View view){
        EditText num1 = (EditText) findViewById(R.id.Num1EditTextId);
        EditText num2 = (EditText) findViewById(R.id.Num2EditTextId);
        TextView result = (TextView) findViewById(R.id.ResultedTextViewId);
        double x =Double.parseDouble(num1.getText().toString());
        double y = Double.parseDouble((num2.getText().toString()));
        double Result = x-y;
        result.setText(Result +"");

        Toast.makeText(this, "burrhh...!!!Subtracted Successfully.", Toast.LENGTH_SHORT).show();
    }

    public
    void DivisionButtonClicked(View view){
        EditText num1 = (EditText) findViewById(R.id.Num1EditTextId);
        EditText num2 = (EditText) findViewById(R.id.Num2EditTextId);
        TextView result = (TextView) findViewById(R.id.ResultedTextViewId);
        double x =Double.parseDouble(num1.getText().toString());
        double y = Double.parseDouble((num2.getText().toString()));
        double Result = x/y;
        result.setText(Result +"");
        Toast.makeText(this, "burrhh...!!!Divided Successfully.", Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button digit1button = (Button) findViewById(R.id.Didgit1ButtonId);
       // Button digit1button = (Button) findViewById(R.id.Didgit1ButtonId);
       final EditText num1 = (EditText) findViewById(R.id.Num1EditTextId);
       // EditText num2 = (EditText) findViewById(R.id.Num2EditTextId);






    }
}
