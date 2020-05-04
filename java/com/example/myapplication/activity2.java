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
     * playerHp
     */
    private int PlayerHp;
    /**
     * health_bar
     */
    private TextView Result;
    /**
     * sum
     */
    private int monster;
    /**
     * health_bar
     */
    private TextView Coins;
    /**
     * sum
     */
    private int coin;
    /**
     * result2
     */
    private TextView Result2;
    /**
     * result2
     */
    private int count = 1;
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
        Result2 = findViewById(R.id.ten);
        Coins = findViewById(R.id.Coin_ten);
        attack.setOnClickListener(this);
        company.setOnClickListener(this);
        shop.setOnClickListener(this);
        setting.setOnClickListener(this);
        PlayerHp = Integer.parseInt(Result2.getText().toString());
        monster = Integer.parseInt(Result.getText().toString());
        coin = Integer.parseInt(Coins.getText().toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attack:
                if (monster > 0) {
                    monster -= 1;
                    PlayerHp -= 1;
                    coin += 1;
                }
                if (monster == 0) {
                    openAcitivity4();
                }
                if (PlayerHp == 0) {
                    openEnd();
                    break;
                }
                Result2.setText(Integer.toString(PlayerHp));
                Result.setText(Integer.toString(monster));
                Coins.setText(Integer.toString(coin));
                Toast.makeText(this, "Attack!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.company:
                if (coin >= 10 * count && monster != 1) {
                    PlayerHp = PlayerHp * 2;
                    coin = coin - 10 * count;
                    count++;

                    Result2.setText(Integer.toString(PlayerHp));
                    Coins.setText(Integer.toString(coin));
                }
                Result2.setText(Integer.toString(PlayerHp));
                Toast.makeText(this, "Increase Buff", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shop:
                if (coin >= 10 * count && monster != 1) {
                    monster = (monster / 2);
                    coin = coin - 10 * count;
                    count++;

                    Result.setText(Integer.toString(monster));
                    Coins.setText(Integer.toString(coin));
                }
                Result.setText(Integer.toString(monster));
                Toast.makeText(this, "Enemy threatened", Toast.LENGTH_SHORT).show();
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
    public void openEnd() {
        Intent intent = new Intent(this, End.class);
        startActivity(intent);
    }


}
