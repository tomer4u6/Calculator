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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv = (TextView) findViewById(R.id.tv);
        btn = (ImageButton) findViewById(R.id.btn);
        tv.setText("Last result: "+getIntent().getExtras().getString("result","*`*"));
        sum = getIntent().getExtras().getDouble("sum",0.0);
    }

    public void ret(View view) {
        Intent t = new Intent(this, MainActivity.class);
        t.putExtra("res", sum);
        startActivity(t);
    }
}

