package com.example.jaywanth.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1;
    Double d;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        ed1=findViewById(R.id.ed1);
        tv1=findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             d=Double.parseDouble(ed1.getText().toString());
             d=(d*68.70);
             Toast.makeText(MainActivity.this, "₹"+String.format("%.3f",d), Toast.LENGTH_SHORT).show();
             tv1.setText("₹"+String.format("%.2f",d));
            }
        });
    }

}
