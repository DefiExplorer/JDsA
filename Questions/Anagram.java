package Questions;

import java.util.Scanner;

//An anagram is a word or phrase that's
//formed by rearranging the letters of another word or phrase.
public class Anagram {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.println("Give your inputs: ");
    String s1 = scn.nextLine();
    String s2 = scn.nextLine();
    scn.close();
    boolean isAnagram = false;
    //We also need to make sure that program works for repeated strings
    //And doesnt produce incorrect result so we implement a check process 
    //for visited index and character using boolean array.
    //An array of booleans are initialized to false and arrays
    //of reference types are initialized to null.
    if(s1.length()==s2.length()){
        boolean visited[] = new boolean[s2.length()];
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                if(c1 == s2.charAt(j) && !visited[j]){
                    visited[j]=true;
                    isAnagram = true;
                    break;
                }
            }
            if(!isAnagram){
                break;
            }
        }
        System.out.println(isAnagram);
    }
    if(isAnagram){
        System.out.println("Both are Anagrams.");
    }
    else{
        System.out.println("Not Anagrams");
    }
    }  
}
//For unknown reason my check isnt working!!!!!