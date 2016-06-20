package com.bealc.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Displays all the apps that will be created in this Nanodegree.
 * Clicking on each button will result in a toast displaying a message.
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button for Popular Movies app
        // A toast message is displayed when button is clicked
        final Button button_movies = (Button) findViewById(R.id.button_popular_movies);
        makeToast(button_movies, "Popular Movies");

        // Button for Stock Hawk app
        // A toast message is displayed when button is clicked
        final Button button_stock = (Button) findViewById(R.id.button_stock_hawk);
        makeToast(button_stock, "Stock Hawk");

        // Button for Build it Bigger app
        // A toast message is displayed when button is clicked
        final Button button_bigger = (Button) findViewById(R.id.button_build_it_bigger);
        makeToast(button_bigger, "Build it Bigger");

        // Button for Make Your App Material app
        // A toast message is displayed when button is clicked
        final Button button_material = (Button) findViewById(R.id.button_app_material);
        makeToast(button_material, "Make Your App Material");

        // Button for Go Ubiquitous app
        // A toast message is displayed when button is clicked
        final Button button_ubiquitous = (Button) findViewById(R.id.button_go_ubiquitous);
        makeToast(button_ubiquitous, "Go Ubiquitous");

        // Button for Capstone app
        // A toast message is displayed when button is clicked
        final Button button_capstone = (Button) findViewById(R.id.button_capstone);
        makeToast(button_capstone, "capstone");
    }

    /**
     * This methods displays a toast message when user clicks on a button.
     * Method requires 2 parameters and returns nothing.
     * @param button_str button_str is the name of the button
     * @param str str is the name of the app in the portfolio
     */
    private void makeToast(Button button_str, final String str) {
        button_str.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "This button will launch my " + str + " app!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
