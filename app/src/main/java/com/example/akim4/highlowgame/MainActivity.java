package com.example.akim4.highlowgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r;

    public void makeToast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guessButton(View view) {

        EditText number = (EditText) findViewById(R.id.number);

        int userNumber = Integer.parseInt(number.getText().toString());

        if (userNumber > r && userNumber < 101) {

            makeToast("Too high!");
            Log.i("Info", "Guess Button was pressed! user guessed too HIGH of " + number.getText().toString() + " but the random number is " + r);

        } else if (userNumber < r && userNumber > 0) {

            makeToast("Too low!");
            Log.i("Info", "Guess Button was pressed! user guessed too LOW of " + number.getText().toString() + " but the random number is " + r);
        } else if (userNumber < 1 || userNumber > 100) {

            makeToast("You must guess a number from 1-100!");
            Log.i("Info", "Guess Button was pressed! User did not follow instructions and exceeded parameters" + number.getText().toString() + " but the random number is " + r);

        } else {

            makeToast("Congratulations, You guessed the correct number!, play again?");
            Log.i("Info", "Guess Button was pressed! User guessed CORRECTLY with " + number.getText().toString() + " and the random number was " + r);

            Random rand = new Random();
            r = rand.nextInt(100)+1;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        r = rand.nextInt(100)+1;

    }
}
