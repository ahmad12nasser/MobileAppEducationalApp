package com.example.a10215336_mobileapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText et_name, et_phone;
    Button btn_submit;
    RadioButton opt_1, opt_2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        et_phone = findViewById(R.id.et_phone);
        btn_submit = findViewById(R.id.btn_submit);
        opt_1 = findViewById(R.id.rd_opt1);
        opt_2 = findViewById(R.id.rd_opt2);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opt_1.isChecked()){
                    String name = et_name.getText().toString();
//                    int phone = Integer.parseInt(et_phone.getText().toString());
                    String phone = et_phone.getText().toString();
                    intent = new Intent(MainActivity.this, ProgrammingActivity.class);
                    startActivity(intent);
                }else if (opt_2.isChecked()){
                    String name = et_name.getText().toString();
//                    int phone = Integer.parseInt(et_phone.getText().toString());
                    String phone = et_phone.getText().toString();
                    intent = new Intent(MainActivity.this, DesignActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}