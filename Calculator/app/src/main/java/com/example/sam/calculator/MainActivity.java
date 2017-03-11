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

    public void Enter(View view) {
    }

    public void Add(View view) {
    }
    public void Sub(View view) {
    }
    public void Mult(View view) {
    }
    public void Divide(View view) {
    }

    public void ClearScreen(View view) {
        System.out.print("Here");
        TextView text = (TextView) view.findViewById(R.id.textView);
        text.setText("");
    }
}
