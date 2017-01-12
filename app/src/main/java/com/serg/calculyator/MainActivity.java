package com.serg.calculyator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int ONE = 1;

    Button one,two,tree,four,five,six,seven,eigtn,nine,noll,summ,minus,plus,baja;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText = (EditText) findViewById(R.id.editText);

        noll = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        tree = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eigtn = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);


        summ = (Button) findViewById(R.id.summ);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        baja = (Button) findViewById(R.id.baja);

        noll.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        tree.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eigtn.setOnClickListener(this);
        nine.setOnClickListener(this);
        summ.setOnClickListener(this);
        minus.setOnClickListener(this);
        baja.setOnClickListener(this);
        plus.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1: editText.setText("1");

                break;
        }
    }
}
