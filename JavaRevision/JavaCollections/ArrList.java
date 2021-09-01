package JavaCollections;
import java.util.ArrayList;
import java.util.List;
//Arraylists are form of dynamic arrays.
//Java provides generics which helps us to restrict the datatype for arraylists.
public class ArrList {
    public static void main(String aga[]){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        //Since, our ArrayList class implements List, so it is recommended to use it this way:
        List<String> games = new ArrayList<>();
        //Mentioning the interface name
        games.add("Badminton");
        //Advantage of this is that later on if we do interconversions, some operations with stack,etc., it becomes
        //easy to do so.
    }
}
