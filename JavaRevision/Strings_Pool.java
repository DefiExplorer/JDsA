public class Strings_Pool {
    public static void main(String xyz[]){
        //String object created in String Pool
        //Similar values are created only once
        //String Pool is created in the Heap section
        String s1 = "Java";
        String s2 = "Python";
        String s3 = "Python";
        //String object created in Heap Section 
        //of Memory, using new keyword.
        String s4 = new String("Java");
        //true
        System.out.println(s2==s3);
        //false
        System.out.println(s1==s4);
        String s5 = s4;
        //false
        System.out.println(s5==s1);
        //true
        System.out.println(s5.equals(s1));
    /*whenever we use a new operator to create a string,
    it creates a new string object in the Java heap.
    We can forcefully stop this feature by using 
    the intern() method of the String class.*/
    String s6 = s4.intern();
    //false
    System.out.println(s5==s6);
    //true
    System.out.println(s6==s1);
    //prints value form String Pool in heap and heap section of memory respectively.
    System.out.println(s6+" "+s4);
    }
    //Overall I found no requirement of using intern(), just dont use new keyword if we want
    //String to be in the Pool
}
/*In computer programming, the flyweight software design pattern refers to an object that
minimizes memory usage by sharing some of its data with other similar objects.
The flyweight pattern is one of twenty-three well-known GoF design patterns.
String Pool is based on Flyweight Design Pattern.
https://springframework.guru/gang-of-four-design-patterns/
*/
