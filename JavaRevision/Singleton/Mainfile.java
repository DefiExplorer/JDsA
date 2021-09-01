package Singleton;

public class Mainfile {
    public static void main(String args[]) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        //Both the objects will be same that is newer objects don't get diff memory space
        System.out.println(obj1==obj2);
    }
}
