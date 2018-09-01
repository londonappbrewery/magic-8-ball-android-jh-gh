package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        final int ballIds[] = new int[]{
                R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5
        };
        final ImageView ballImage = findViewById(R.id.mainBallImage);
        Button askButton = findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballImage.setImageResource(ballIds[getAnswerIndex()]);
            }
        });
    }
    private int getAnswerIndex() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
