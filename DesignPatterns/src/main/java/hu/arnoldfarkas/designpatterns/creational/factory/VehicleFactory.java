package hu.arnoldfarkas.designpatterns.creational.factory;

import hu.arnoldfarkas.designpatterns.creational.factory.vehicle.Bicycle;
import hu.arnoldfarkas.designpatterns.creational.factory.vehicle.Car;

public class VehicleFactory
{

    public Vehicle createVehicle(String type)
    {
        if (type == null)
        {
            return null;
        }

        if ("CAR".equalsIgnoreCase(type.trim()))
        {
            return new Car();
        }

        if ("BICYCLE".equalsIgnoreCase(type.trim()))
        {
            return new Bicycle();
        }

        return null;
    }
}
