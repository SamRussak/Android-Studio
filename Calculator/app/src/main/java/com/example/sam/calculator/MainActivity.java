package com.example.sam.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ClearScreen(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("");
    }

    public void Enter(View view) {

    }

    public void Plus(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append(" + ");
    }
    public void Minus(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append(" - ");
    }
    public void Mult(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append(" * ");
    }
    public void Divide(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append(" / ");
    }

    public void Zero(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("0");
    }
    public void One(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("1");
    }
    public void Two(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("2");
    }
    public void Three(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("3");
    }
    public void four(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("4");
    }
    public void Five(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("5");
    }
    public void Six(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("6");
    }
    public void Seven(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("7");
    }
    public void Eight(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("8");
    }

    public void Nine(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.append("9");
    }

}
