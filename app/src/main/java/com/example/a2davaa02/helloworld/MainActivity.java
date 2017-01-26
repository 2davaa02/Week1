package com.example.a2davaa02.helloworld;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.btn1);
        b.setOnClickListener(this);

        /*
        TextView tv= new TextView(this);
        tv.setText("Hello World!");
        setContentView(tv);*/
    }

    public void onClick(View view)
    {

        TextView tv=(TextView)findViewById(R.id.tv1);
        EditText et=(EditText)findViewById(R.id.et1);
        String yearAsString=et.getText().toString();

        if(yearAsString.equals(""))
        {
            tv.setText("Error!");
        }else
        {
            int yearOfBirth=Integer.parseInt(yearAsString);
            int age=2016-yearOfBirth;
            tv.setText("Your age is: "+String.valueOf(age));
        }

    }
}
