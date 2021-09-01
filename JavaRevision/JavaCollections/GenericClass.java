package JavaCollections;
import java.util.Scanner;

public class GenericClass {
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt();
        String b = scn.nextLine();
        scn.close();
        Pair<Integer,String> p1=new Pair<>(a,b);
        p1.display();
    }
}
