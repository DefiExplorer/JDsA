package Inheritance;
//extends keyword is used for creating child of a class
public class Teacher extends Person{
    public void teach() {
        System.out.println(name+" is teaching.");
        //it is able to use the variable from Person class because
        //it is the child of it
    }
}
