package Abstraction;

public class Audi extends Car{
    /*String name;
    public Audi(){
        name = "Audi A1";
    }*/
    @Override
    public void accelerate(){
        System.out.println("Audi acclerates at 20mph.");
    }
    @Override
    public void breaking(){
        System.out.println("Audi is breaking;");
    }
}
//Abstract Method must be overriden
//The @Override annotation denotes that the child class method overrides the base class method. For two reasons, the @Override annotation is useful.
//If the annotated method does not actually override anything, the compiler issues a warning. It can help to make the source code more readable.
