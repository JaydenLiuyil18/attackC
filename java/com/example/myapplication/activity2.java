package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class activity2 extends AppCompatActivity implements View.OnClickListener {
    /**
     * health_bar
     */
    private TextView Result;
    /**
     * sum
     */
    private int sum;
    /**
     * health_bar
     */
    private TextView Coins;
    /**
     * sum
     */
    private int coin;

    /**
     * lalala
     * @param savedInstanceState lalala.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Button attack = findViewById(R.id.attack);
        Button company = findViewById(R.id.company);
        Button shop = findViewById(R.id.shop);
        Button setting = findViewById(R.id.setting);
        Result = findViewById(R.id.twenty);
        Coins = findViewById(R.id.Coin_ten);
        attack.setOnClickListener(this);
        company.setOnClickListener(this);
        shop.setOnClickListener(this);
        setting.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attack:
                sum = Integer.parseInt(Result.getText().toString());
                coin = Integer.parseInt(Coins.getText().toString());
                if (sum > 0) {
                    sum -= 1;
                    coin += 1;
                }
                if (sum == 0) {
                    openAcitivity4();
                }
                Result.setText(Integer.toString(sum));
                Coins.setText(Integer.toString(coin));
                Toast.makeText(this, "Attack!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.company:
                Toast.makeText(this, "Hire soldiers", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shop:
                Toast.makeText(this, "Buy elixir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                openAcitivity3();
                Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show();
                break;

        }

    }
    public void openAcitivity3() {
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }
    public void openAcitivity4() {
        Intent intent = new Intent(this, activity4.class);
        startActivity(intent);
    }


}
