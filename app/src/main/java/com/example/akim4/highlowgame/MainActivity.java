package com.example.akim4.highlowgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int r = rand.nextInt(100)+1;

    public void guessButton(View view){

        EditText number = (EditText) findViewById(R.id.number);
        int userNumber =Integer.parseInt(number.getText().toString());


        if (userNumber > r && userNumber < 101){
            Toast.makeText(MainActivity.this, "Too high, try again!", Toast.LENGTH_SHORT).show();
            Log.i("Info", "Guess Button was pressed! user guessed too HIGH of " + number.getText().toString() + " but the random number is " + r);
        }else if (userNumber < r && userNumber > 0) {
            Toast.makeText(MainActivity.this, "Too low, try again!", Toast.LENGTH_SHORT).show();
            Log.i("Info", "Guess Button was pressed! user guessed too LOW of " + number.getText().toString() + " but the random number is " + r);
        }else if (userNumber < 1 || userNumber > 100) {
            Toast.makeText(MainActivity.this, "You must guess a number from 1-100!", Toast.LENGTH_LONG).show();
            Log.i("Info", "Guess Button was pressed! User did not follow instructions and exceeded parameters" + number.getText().toString() + " but the random number is " + r);
        }else if (userNumber == r) {

            Random rand = new Random();
            int r = rand.nextInt(100)+1;


            Toast.makeText(MainActivity.this, "Congratulations, You guessed the correct number!", Toast.LENGTH_LONG).show();
            Log.i("Info", "Guess Button was pressed! User guessed CORRECTLY with " + number.getText().toString() + " and the random number was " + r);



        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
