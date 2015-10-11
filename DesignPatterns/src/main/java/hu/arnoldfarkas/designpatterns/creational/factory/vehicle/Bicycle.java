package hu.arnoldfarkas.designpatterns.creational.factory.vehicle;

import hu.arnoldfarkas.designpatterns.creational.factory.Vehicle;

public class Bicycle implements Vehicle
{

    @Override
    public void go()
    {
        System.out.println("bicycle.go()");
    }
    
}
