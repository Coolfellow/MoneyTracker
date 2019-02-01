package ru.redshart.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause: ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("MainActivity", "onPostResume: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onPostResume: ");
    }
}
