package com.example.a10215336_mobileapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.math.BigDecimal;

public class ProgrammingActivity extends AppCompatActivity {
    RadioButton rd_course1, rd_course2, rd_course3;
    CheckBox checkBox;
    Button btn_submit;
    double amount = 0;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);
        rd_course1 = findViewById(R.id.rd_course1);
        rd_course2 = findViewById(R.id.rd_course2);
        rd_course3 = findViewById(R.id.rd_course3);
        btn_submit = findViewById(R.id.btn_submit);
        checkBox = findViewById(R.id.checkBox);

        rd_course1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    showToast("Mobile App is selected");
                    amount = amount + 200;
                }
            }
        });
        rd_course2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    showToast("DataBase is selected");
                    amount = amount + 250;
                }
            }
        });
        rd_course3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    showToast("Machine Learning is selected");
                    amount = amount + 325;
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    showToast("Online Consulting is checked with your course");
                    amount = amount + 50;
                }
            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ProgrammingActivity.this, ReceiptActivity.class);
                intent.putExtra("Amount", amount);
                startActivity(intent);
            }
        });
    }
    private void showToast(String mess){
        Toast.makeText(getApplicationContext(),mess,Toast.LENGTH_SHORT).show();
    }
}