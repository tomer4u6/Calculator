package com.example.tomer.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

public class CreditsActivity extends AppCompatActivity {
    TextView tv;
    ImageButton btn;
    double sum;
    Intent back;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv = (TextView) findViewById(R.id.tv);
        btn = (ImageButton) findViewById(R.id.btn);
        back = getIntent();
        st = back.getExtras().getString("result", "**--*");
        tv.setText("Last result: "+ st);
    }

    public void ret(View view) {
        back.putExtra("res", Double.toString(Double.parseDouble(st))+" OK");
        setResult(RESULT_OK, back);
        finish();
    }
}

