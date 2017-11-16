package com.londonappbrewery.magiceightball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set the view of image_eightball
        val ballDisplay = findViewById<View>(R.id.image_eightball) as ImageView

        // place drawable 5 ball images in a list
        val ballArray = intArrayOf(R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5)

        // set the view of ask_button
        val myButton = findViewById<View>(R.id.ask_button) as Button

        // define myButton onClick procedure
        myButton.setOnClickListener() // This code gets executed when "myButton" is pressed
        {
            // Create a random number generator
            val randomNumberGenerator = Random()

            // Make the random number generator spit out a new random number
            val number = randomNumberGenerator.nextInt(5)

            // Print this random number to the logcat to see it in the Android monitor
            Log.d("Ball", "The number is " + number)

            // grab a random ball image from "ballArray". Then tell "ballDisplay" to display
            // this image
            ballDisplay.setImageResource(ballArray[number])
        }


    }
}
