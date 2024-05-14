package com.example.a10215336_mobileapp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ReceiptActivity extends AppCompatActivity {
    Intent intent;
    CheckBox checkBox2, checkBox3;
    Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        btn_submit = findViewById(R.id.btn_submit);
        intent = getIntent();
        double amount = intent.getDoubleExtra("Amount", 0.0);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkBox2.isChecked() && !checkBox3.isChecked()) {
                    showToast("Please select an option");
                } else if (checkBox2.isChecked() && checkBox3.isChecked()) {
                    showToast("Please select only one option");
                }else{
                    if(checkBox2.isChecked()){
                        System.exit(0);
                    }else {
                        intent = new Intent(ReceiptActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private void showToast(String mess){
        Toast.makeText(ReceiptActivity.this, mess, Toast.LENGTH_SHORT).show();
    }
}