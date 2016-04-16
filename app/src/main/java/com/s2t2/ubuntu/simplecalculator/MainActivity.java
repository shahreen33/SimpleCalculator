package com.s2t2.ubuntu.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button AddButton, SubButton;
    private TextView FirstTV, SecondTV;
    private EditText FirstET, SecondET, ResultET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init()
    {
        AddButton = (Button)findViewById(R.id.AddBtn);
        SubButton =  (Button)findViewById(R.id.SubBtn);
        FirstTV=  (TextView)findViewById(R.id.FirstTextView);
        SecondTV=  (TextView)findViewById(R.id.SecondTextView);
        FirstET =  (EditText)findViewById(R.id.FET);
        SecondET =  (EditText)findViewById(R.id.SET);
        ResultET = (EditText)findViewById(R.id.ResET);


        AddButton.setOnClickListener(this);
        SubButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        String num1 = FirstET.getText().toString();
        String num2 = SecondET.getText().toString();

        switch (view.getId())
        {
            case R.id.AddBtn:
                int add = Integer.parseInt(num1)+ Integer.parseInt(num2);
                ResultET.setText(String.valueOf(add));
                break;

            case R.id.SubBtn:
                int sub= Integer.parseInt(num1)- Integer.parseInt(num2);
                ResultET.setText(String.valueOf(sub));
                break;


        }
    }





}
