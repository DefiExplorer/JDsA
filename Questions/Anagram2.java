package Questions;
import java.util.*;
public class Anagram2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Give your inputs: ");
        String s1 = scn.nextLine();
        System.out.println("Enter next input: ");
        String s2 = scn.nextLine();
        scn.close();
        boolean isAnagram = false;
        //Make both strings into character array, then
        //By taking help from ASCII table which is 256 char long
        //and creating 2 arrays for both input strings
        //which stores count of the character for each string
        //then compare the 2 arrays.
        int[] al = new int[256];
        int[] bl = new int[256];
        //Initially our int array has value 0.
        for(char c1:s1.toCharArray()){
            //int index = Character.getNumericValue(c1);
            int index = (int) c1;
            //Typecasting char into int also gives the corresponding ascii
            //value, since our int array is also of 256 length
            //that char ascii value will act as index
            al[index]++;

        }
        //same for 2nd string
        for(char c2:s2.toCharArray()){
            int index = (int) c2;
            bl[index]++;
        }
        //Again we need to iterate in both the arrays to check
        for(int i =0; i<256; i++){
            if(al[i]==bl[i]){
                isAnagram=true;
            }
            else{
                isAnagram=false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Both are Anagrams.");
        }
        else{
            System.out.println("Not Anagrams");
        }
        }  
}
//Works Well
//We can optimise this by using single array only:
//see Anagram3.java