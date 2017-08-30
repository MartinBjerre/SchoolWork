package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static int numb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numb=0;
    }
    public void Addone (View view)
    {
        numb += 1;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(numb));
    }
}
