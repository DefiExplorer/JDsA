package Abstraction;

public class RepairShop {
    public static void repairCar(Car car){
        //repairCar(Car car) instead of using repairCar(Audi car)
        //Since, we implemented asbtraction..therefore this method is not repeated for diff cars.
        System.out.println("Your car "+/*car.name+*/" is Repaired.");
    }
    public static void main(String args[]){
        Audi car = new Audi();
        Bmw car2 = new Bmw();
        Car car3 = new Audi();
        //we can't create an object of an abstract class.
        //But we can create a reference variable of an abstract class.
        //The reference variable is used to refer to the objects of derived classes (subclasses of abstract class).
        repairCar(car);
        repairCar(car2);
        repairCar(car3);
    }
}
