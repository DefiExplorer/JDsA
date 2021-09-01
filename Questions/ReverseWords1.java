package Questions;
import java.util.*;
//Task is to reverse string words not character
public class ReverseWords1{
    public static void main(String abx[]){
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        scn.close();
        String s2 = s.trim();
        String[] sarr = s2.split(" ");
        int len = sarr.length;
        
        for(int i= len-1; i>=0; i--){
            System.out.print(sarr[i]+" ");
        }
    }
}
//Improve code if the string contains more spaces
//You need to reduce the multiple spaces in output
//see ReserseWords.java