package Questions;
import java.util.*;
public class Anagram3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Give your inputs: ");
        String s1 = scn.nextLine();
        System.out.println("Enter next input: ");
        String s2 = scn.nextLine();
        scn.close();
        boolean isAnagram = false;
        int[] al = new int[256];

        for(char c1:s1.toCharArray()){
            int index = (int) c1;
            al[index]++;

        }
        for(char c2:s2.toCharArray()){
            int index = (int) c2;
            al[index]--;
        }
        for(int i =0; i<256; i++){
            if(al[i]==0){
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
