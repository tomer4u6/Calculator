package com.example.tomer.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btnA, btnS, btnM, btnD, btnE, btnC, cdts;
    double num1;
    String st;
    int x=1;
    double sum = 0;
    double tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.et);
        btnA = (Button) findViewById(R.id.btnA);
        btnS = (Button) findViewById(R.id.btnS);
        btnM = (Button) findViewById(R.id.btnM);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnC = (Button) findViewById(R.id.btnC);
        cdts = (Button) findViewById(R.id.cdts);
        if(getIntent().getExtras()!=null)
            tmp = getIntent().getExtras().getDouble("res", -3.14);
    }

    public void add(View view) {
        if(!(et.getText().toString().equals(""))) {
            if (!(et.getText().toString().equals(".")) && !(et.getText().toString().equals("-")) && !(et.getText().toString().equals("-."))) {
                st = et.getText().toString();
                num1 = Double.parseDouble(st);
                et.setText("");
                switch (x) {
                    case 1:
                        sum = sum + num1;
                        break;
                    case 2:
                        sum = sum - num1;
                        break;
                    case 3:
                        sum = sum * num1;
                        break;
                    case 4:
                        if (num1 == 0)
                            Toast.makeText(this, "cannot divide by zero", Toast.LENGTH_SHORT).show();
                        else
                            sum = sum / num1;
                        break;
                }
                et.setHint(Double.toString(sum));
            } else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                et.setText("");
            }
            x = 1;
        }
        else
            Toast.makeText(this, "No number was entered", Toast.LENGTH_SHORT).show();
    }

    public void sub(View view) {
        if(!(et.getText().toString().equals(""))) {
            if (!(et.getText().toString().equals(".")) && !(et.getText().toString().equals("-")) && !(et.getText().toString().equals("-."))) {
                st = et.getText().toString();
                num1 = Double.parseDouble(st);
                et.setText("");
                switch (x) {
                    case 1:
                        sum = sum + num1;
                        break;
                    case 2:
                        sum = sum - num1;
                        break;
                    case 3:
                        sum = sum * num1;
                        break;
                    case 4:
                        if (num1 == 0)
                            Toast.makeText(this, "cannot divide by zero", Toast.LENGTH_SHORT).show();
                        else
                            sum = sum / num1;
                        break;
                }
                et.setHint(Double.toString(sum));
            } else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                et.setText("");
            }
            x = 2;
        }
        else
            Toast.makeText(this, "No number was entered", Toast.LENGTH_SHORT).show();
    }

    public void mul(View view) {
        if(!(et.getText().toString().equals(""))) {
            if (!(et.getText().toString().equals(".")) && !(et.getText().toString().equals("-")) && !(et.getText().toString().equals("-."))) {
                st = et.getText().toString();
                num1 = Double.parseDouble(st);
                et.setText("");
                switch (x) {
                    case 1:
                        sum = sum + num1;
                        break;
                    case 2:
                        sum = sum - num1;
                        break;
                    case 3:
                        sum = sum * num1;
                        break;
                    case 4:
                        if (num1 == 0)
                            Toast.makeText(this, "cannot divide by zero", Toast.LENGTH_SHORT).show();
                        else
                            sum = sum / num1;
                        break;
                }
                et.setHint(Double.toString(sum));
            } else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                et.setText("");
            }
            x = 3;
        }
        else
            Toast.makeText(this, "No number was entered", Toast.LENGTH_SHORT).show();
    }

    public void div(View view) {
        if(!(et.getText().toString().equals(""))) {
            if (!(et.getText().toString().equals(".")) && !(et.getText().toString().equals("-")) && !(et.getText().toString().equals("-."))) {
                st = et.getText().toString();
                num1 = Double.parseDouble(st);
                et.setText("");
                switch (x) {
                    case 1:
                        sum = sum + num1;
                        break;
                    case 2:
                        sum = sum - num1;
                        break;
                    case 3:
                        sum = sum * num1;
                        break;
                    case 4:
                        if (num1 == 0)
                            Toast.makeText(this, "cannot divide by zero", Toast.LENGTH_SHORT).show();
                        else
                            sum = sum / num1;
                        break;
                }
                et.setHint(Double.toString(sum));
            } else {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                et.setText("");
            }
            x = 4;
        }
        else
            Toast.makeText(this, "No number was entered", Toast.LENGTH_SHORT).show();
    }

    public void clear(View view) {
        et.setText("");
        et.setHint("0");
        x = 1;
        sum = 0;
        num1 = 0;
    }

    public void eql(View view) {
        if(!(et.getText().toString().equals(""))) {
            if (!(et.getText().toString().equals(".")) && !(et.getText().toString().equals("-")) && !(et.getText().toString().equals("-."))) {
                st = et.getText().toString();
                num1 = Double.parseDouble(st);
                switch (x) {
                    case 1:
                        sum = sum + num1;
                        break;
                    case 2:
                        sum = sum - num1;
                        break;
                    case 3:
                        sum = sum * num1;
                        break;
                    case 4:
                        if (num1 == 0)
                            Toast.makeText(this, "cannot divide by zero", Toast.LENGTH_SHORT).show();
                        else
                            sum = sum / num1;
                        break;
                }
            }
            else
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
        et.setText("");
        et.setHint(Double.toString(sum));
        tmp = sum;
        sum = 0;
        num1 = 0;
        x = 1;
    }

    public void cdts_page(View view) {
        Intent t = new Intent(this, CreditsActivity.class);
        if(sum==0){
            st = Double.toString(tmp);
            t.putExtra("result", st);
            t.putExtra("sum", tmp);
        }
        else{
            st = Double.toString(sum);
            t.putExtra("result", st);
            t.putExtra("sum", sum);
        }
        startActivity(t);
    }
}