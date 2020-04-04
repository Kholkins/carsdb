package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addCar(new Car("Toyota", "30000"));
        databaseHandler.addCar(new Car("Mercedes", "50000"));
        databaseHandler.addCar(new Car("Opel", "25000"));
        databaseHandler.addCar(new Car("Kia", "31000"));

        List<Car> listCars = databaseHandler.getAllCar();
        for (Car car: listCars){
            Log.d("car: ", "id "+car.getId()+", name "+car.getName()+", price "+ car.getPrice());
        }
    }
}
