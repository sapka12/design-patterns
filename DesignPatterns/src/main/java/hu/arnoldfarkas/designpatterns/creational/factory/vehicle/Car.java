package hu.arnoldfarkas.designpatterns.creational.factory.vehicle;

import hu.arnoldfarkas.designpatterns.creational.factory.Vehicle;

public class Car implements Vehicle
{

    @Override
    public void go()
    {
        System.out.println("car.go()");
    }
    
}
