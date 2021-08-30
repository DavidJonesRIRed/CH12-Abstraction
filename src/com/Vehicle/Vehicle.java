package com.Vehicle;

import java.util.ArrayList;

public class Vehicle {

    EngineV8 myV8 = new EngineV8();
    public int passengers;

    public void addPassenger(){
        passengers += 1;
    }

    public void removePassenger(){
        passengers -= 1;
    }

    public void startEngine(){
        myV8.engineStart();
    }

    public void stopEngine(){
        myV8.engineStop();
    }
}
