package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String main="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zero(View View)
    {
        main=main+"0";
        display(main);
    }
    public void one(View View)
    {
        main=main+"1";
        display(main);
    }
    public void two(View View)
    {
        main=main+"2";
        display(main);
    }
    public void three(View View)
    {
        main=main+"3";
        display(main);
    }
    public void four(View View)
    {
        main=main+"4";
        display(main);
    }
    public void five(View View)
    {
        main=main+"5";
        display(main);
    }
    public void six(View View)
    {
        main=main+"6";
        display(main);
    }
    public void seven(View View)
    {
        main=main+"7";
        display(main);
    }
    public void eight(View View)
    {
        main=main+"8";
        display(main);
    }
    public void nine(View View)
    {
        main=main+"9";
        display(main);
    }
    public void divide(View View)
    {
        main=main+"/";
        display(main);
    }
    public void multiply(View View)
    {
        main=main+"*";
        display(main);
    }
    public void add(View View)
    {
        main=main+"+";
        display(main);
    }
    public void subtract(View View)
    {
        main=main+"-";
        display(main);
    }
    public void dot(View View)
    {
        main=main+".";
        display(main);
    }
    public void AC(View View)
    {
        main="Calculate Here...";
        display(main);
        main="";
        displayanswer(0);
    }
    public void backspace(View View)
    {
        if(main!="")
        {
            int length = main.length();
            main = main.substring(0, length - 1);
            display(main);
            displayanswer(0);
        }
    }
    public void equalTo(View View)
    {
        int mainLength=main.length();
        int variableOne=0;
        int variableTwo=0;
        for(int i=0;i<mainLength;i++)
        {
              if ((int)(main.charAt(i))<48||(int)(main.charAt(i))>57)
              {
                  char symbol = main.charAt(i);
                  i=i+1;
                  variableTwo=0;
                  while (i<mainLength&&((int) (main.charAt(i)) >= 48 )&& ((int) (main.charAt(i)) <= 57)) {
                      variableTwo = variableTwo * 10 + ((int) main.charAt(i)) - 48;
                      i=i+1;
                  }
                  i--;
                  if (symbol == '+') {
                      variableOne = variableOne + variableTwo;
                  }
                  if (symbol == '-') {
                      variableOne = variableOne - variableTwo;
                  }
                  if(symbol=='*')
                  {
                      variableOne=variableOne * variableTwo;
                  }
                  if(symbol=='/')
                  {
                      variableOne=variableOne / variableTwo;
                  }
                  variableTwo=0;
              }
              else{
                  variableOne = variableOne*10 + (int)(main.charAt(i)-48);
                  }
        }
        displayanswer(variableOne);
    }

    private void display(String message) {
        TextView displaytext = (TextView) findViewById(R.id.display);
        displaytext.setText(message);
    }
    private void displayanswer(int message) {
        TextView displaytext = (TextView) findViewById(R.id.displayanswer);
        displaytext.setText("Ans."+message);
    }
}

