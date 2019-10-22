package com.example.walte.calculadorawalter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.PrintStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity
{

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button_sub, button_soma, button_div, button_mult, ce, voltar;

    TextView text1, text2, text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        ce = (Button) findViewById(R.id.ce);
        voltar = (Button) findViewById(R.id.voltar);
        button_sub = (Button) findViewById(R.id.button_sub);
        button_soma = (Button) findViewById(R.id.button_soma);
        button_div = (Button) findViewById(R.id.button_div);
        button_mult = (Button) findViewById(R.id.button_mult);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);



    }
    boolean bool = false;
    public void button_1(View v)
    {
        if(bool == false)
        {

            {
                String str = text1.getText().toString();
                text1.setText(str + "1");

            }
        }
        else
            {
                String str = text2.getText().toString();
                text2.setText(str +"1");
            }

    }
    public void button_2(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"2");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"2");
        }

    }
    public void button_3(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"3");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"3");
        }

    }
    public void button_4(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"4");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"4");
        }

    }
    public void button_5(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"5");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"5");
        }

    }
    public void button_6(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"6");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"6");
        }

    }
    public void button_7(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"7");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"7");
        }

    }
    public void button_8(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"8");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"8");
        }

    }
    public void button_9(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"9");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"9");
        }

    }
    public void button_10(View v)
    {
        if(bool == false)
        {
            String str = text1.getText().toString();
            text1.setText(str +"0");
        }
        else
        {
            String str = text2.getText().toString();
            text2.setText(str +"0");
        }

    }
    public void button_11(View v)
    {
        if (bool == false)
        {
            String str_virgula = text1.getText().toString();
            if (str_virgula.contains("."))
            {

            }
            else
                {
                    String str = text1.getText().toString();
                    text1.setText(str + ".");

                }
        }
        else
        {
            String str_virgula = text2.getText().toString();
            if (str_virgula.contains("."))
            {

            }
            else
                {
                    String str = text2.getText().toString();
                    text2.setText(str + ".");

               }
        }
    }
    public void button_12(View v)
    {
        String text_1 = text1.getText().toString();
        String text_2 = text2.getText().toString();
        String text_3 = text3.getText().toString();


        if(text_2.length()>0)
        {
            float txt1 = Float.valueOf(text_1);
            float txt2 = Float.valueOf(text_2);
            if(text_3.contains("-"))
            {
                float contas = txt1-txt2;
                
                String str = Float.toString(contas);
                text1.setText(str);
                String str2 = "";
                text2.setText(str2);
            }
            else if (text_3.contains("+"))
            {
                float contas = txt1+txt2;
                String str = Float.toString(contas);
                text1.setText(str);
                String str2 = "";
                text2.setText(str2);
            }
            else if (text_3.contains("/"))
            {
                float contas = txt1/txt2;
                String str = Float.toString(contas);
                text1.setText(str);
                String str2 = "";
                text2.setText(str2);
            }
            else if (text_3.contains("*"))
            {
                float contas = txt1*txt2;
                String str = Float.toString(contas);
                text1.setText(str);
                String str2 = "";
                text2.setText(str2);
            }
            else
            {

                Toast.makeText(this, "Não foi possivel calcular!", Toast.LENGTH_SHORT).show();
            }

        }
        else
            {
               text3.setText(text_3);
            }

    }
    public void ce(View v)
    {
        bool = false;
        text1.setText("");
        text2.setText("");
        text3.setText("");
    }
    public void voltar(View v)
    {

        if(bool == false)
        {
            String str = text1.getText().toString();
            {

                if (str.length() > 0)
                {
                    String str_sub = str.substring(0, str.length() - 1);
                    text1.setText(str_sub);

                }
                else
                    {
                        text1.setText(" ");
                    }
            }

        }
        else
        {
            String str = text2.getText().toString();
            if(str.length()> 0)
            {
                String str_sub = str.substring(0,str.length() -1);
                text2.setText(str_sub);
            }
            else
            {
                text2.setText("");
            }
        }

    }

    public void button_sub(View v)
    {
        if(bool == false) {

            text3.setText("-");
            bool = true;
        }
        else{
            text3.setText("-");


        }
    }
    public void button_soma(View v)
    {
        if(bool == false) {

            text3.setText("+");
            bool = true;
        }
        else{
            text3.setText("+");


        }
    }
    public void button_div(View v)
    {
        if(bool == false) {

            text3.setText("/");
            bool = true;
        }
        else{
            text3.setText("/");


        }
    }
    public void button_mult(View v)
    {
        if(bool == false) {

            text3.setText("*");
            bool = true;
        }
        else{
            text3.setText("*");


        }
    }
}

