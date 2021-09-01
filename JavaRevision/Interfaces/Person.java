package Interfaces;

public class Person implements Student, Youtuber{
    public static void main(String arg[]){
        Person obj = new Person();
        obj.study();
        obj.makevideo();
    }
    @Override
    public void study(){
        System.out.println("Person Studies.");
    }
    @Override
    public void makevideo(){
        System.out.println("Person makes video");
    }
    
}
//VS Code gives error always, dont know why.