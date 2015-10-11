package hu.arnoldfarkas.designpatterns.creational.factory;

public class DemoFactory
{

    public static void main(String[] args)
    {
        VehicleFactory factory = new VehicleFactory();
        
        Vehicle car = factory.createVehicle("CAR");
        car.go();
        
        Vehicle bicycle = factory.createVehicle("BICYCLE");
        bicycle.go();
    }
    
}
