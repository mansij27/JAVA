class Vehicle {
    String vehicleName;
    void displayData()
    {
        System.out.println("From Vehicle class");
    }
}
  
class Bike extends Vehicle {
    double cost;
    void displayData()
    {
        System.out.println("From bike class" +cost);
    }
}
  
public class ClassCastException {
    public static void main(String[] args)
    {
        Vehicle vobj = new Bike();
        vobj.vehicleName = "BMW";

        // Downcasting Explicitly
        Bike bikeobj = (Bike)vobj;
        bikeobj.cost = 95000;
        
        // Though vehiclename is not assigned, it takes BMW
        System.out.println(bikeobj.vehicleName);
        System.out.println(bikeobj.cost);
        bikeobj.displayData();
    }
}