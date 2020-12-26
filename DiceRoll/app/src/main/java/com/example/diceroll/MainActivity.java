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

        findViewById(R.id.loadingPanel).setVisibility(View.GONE);

        TextView btnExample = findViewById(R.id.txtFlip);
        btnExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {

        /*findViewById(R.id.loadingPanel).setVisibility(View.VISIBLE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        findViewById(R.id.loadingPanel).setVisibility(View.GONE);*/


        Random rand = new Random();
        int value = rand.nextInt(6) + 1;
        ImageView coin = findViewById(R.id.coinImage);

        switch(value) {
            case 1:
                coin.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                coin.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                coin.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                coin.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                coin.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                coin.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}