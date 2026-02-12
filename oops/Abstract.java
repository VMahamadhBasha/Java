abstract class  Vehicle {
    abstract void start();   
}
class Bike extends Vehicle {
    void start(){
        System.out.println("Bike is Starting...");
    }
    
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is starting ...");
    }

    
}


public class Abstract {
    public static void main(String[] args) {
        Bike bike=new Bike();
        Car car=new Car();
        bike.start();
        car.start();
        
    }
}
