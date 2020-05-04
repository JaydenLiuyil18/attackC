package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//import java.net.MalformedURLException;

/**
 * downloading url
 */
public class MainActivity extends AppCompatActivity {
    /**
     * do.
     */
    private Button button;

    /**
     * oncreate;
     * @param savedInstanceState it is an Instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAcitivity2();

            }
        });
    }

    /**
     * dowanload URL
     */
    public void openAcitivity2() {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }


}
