package com.Vehicle;

public class EngineV8 extends Engine{
    @Override
    public void engineStart() {
        System.out.println("Engine has Started");
    }

    @Override
    public void engineStop() {
        System.out.println("Engine has Stopped");
    }
}
