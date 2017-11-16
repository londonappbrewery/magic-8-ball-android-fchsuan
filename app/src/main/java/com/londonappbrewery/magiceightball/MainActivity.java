package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // var ballDisplay: ImageView = findViewById( R.id.image_eightball)
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightball);

        // val ballArray = List of 5 ball images
        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        // var myButton to link with the ask_button
        Button myButton = (Button) findViewById(R.id.ask_button);

        // Tell the button to listen for clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
                // This code gets executed when "myButton" is pressed
            public void onClick(View v) {

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(5);

                // Print this random number to the logcat to see it in the Android monitor
                Log.d("Ball", "The number is " + number );

                // grab a random ball image from "ballArray". Then tell "ballDisplay" to display
                // this image
                ballDisplay.setImageResource(ballArray[number]);

            }
        });


    }
}
