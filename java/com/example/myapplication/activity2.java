package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Button attack = findViewById(R.id.attack);
        Button company = findViewById(R.id.company);
        Button shop = findViewById(R.id.shop);
        Button setting = findViewById(R.id.setting);

        attack.setOnClickListener(this);
        company.setOnClickListener(this);
        shop.setOnClickListener(this);
        setting.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attack:
                Toast.makeText(this, "Attack!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.company:
                Toast.makeText(this, "Hire soldiers", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shop:
                Toast.makeText(this, "Buy elixir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
