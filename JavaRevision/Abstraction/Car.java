package Abstraction;
//class must be abstract too for abstract methods
public abstract class Car {
    //Abstract keyword lets us avoid defining the method
    //public void accelerate(){}
    public abstract void accelerate();
    //Since, car is just an idea or concept, so acceleration of car doesn't seems right to define as
    //different cars have acceleration of its own.
    //Therefore we hide this detail, and redefine the method in the child class.
    public abstract void breaking();
}
