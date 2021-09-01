package Inheritance;

public class Runmain {
    public static void main (String[] args){
        Teacher t = new Teacher();

        t.name="Mr. Crypt";
        //From person class
        t.eat();
        t.walk();
        //its own function
        t.teach();
        //Parent functions can be overidden and the program executes that
        //only.
        Baby b = new Baby();
        b.name="Munna";
        b.eat();

        Teacher t1 = new Teacher();
        //Upcasting or Implicit casting
        Person p = t1;
        p.walk();
        p.eat();
        //Downcastiing or Explicit casting
        Person p1 = new Person();
        Baby b1 =(Baby) p1;
        b1.plays();
        //No Compile time error will occur
        //This will give error while runtime as Person!=Baby
        //So instead we do-->
        Baby b2 = new Baby();
        Person p3 = b2;
        Baby b3 = (Baby) p3;
        b3.eat();
        //This doesnt give error as b3 is ultimately baby
        //Note: - To check the which class object belongs to, we use:
        boolean check = b3 instanceof Person;
        System.out.println(check);
    }
}
//Java does not support multiple inheritance of classes.
//This is avoid problems like Diamond problem.