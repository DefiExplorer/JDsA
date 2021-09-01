package Abstraction;

public class Bmw extends Car{
    @Override
    public void accelerate(){
        System.out.println("BMW is accelerting at 25mph.");
    }
    @Override
    public void breaking(){
        System.out.println("Bmw brakes are good.");
    }
}
