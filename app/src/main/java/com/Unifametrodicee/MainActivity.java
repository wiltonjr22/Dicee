package com.Unifametrodicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = findViewById(R.id.rollbutton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int [] diceearray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        leftDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6);
                leftDice.setImageResource(diceearray[number]);
                number = numberRandom.nextInt(6);
                rightDice.setImageResource(diceearray[number]);

            }
        });

    }
}