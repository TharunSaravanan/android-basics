package com.example.diceroll;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btnExample = findViewById(R.id.txtFlip);
        btnExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int value = rand.nextInt(2);
                ImageView coin = findViewById(R.id.coinImage);


                if(value == 0){
                    coin.setImageResource(R.drawable.heads);
                }
                else {
                    coin.setImageResource(R.drawable.tails);
                }
            }
        });

    }
}