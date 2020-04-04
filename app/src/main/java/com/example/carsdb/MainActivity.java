package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addCar(new Car());
    }
}
