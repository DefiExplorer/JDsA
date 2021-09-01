package Questions;
import java.util.*;
public class ReverseWords2 {
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        scn.close();
        String s2 = s.trim();
        String fnl = "";
        //We go by char to char in reverse order
        //print the chars if it is not equal to space
        
        int len = s2.length()-1;
        int i = len;
        while(i>=0){
            //while(i>=0&&s2.charAt(i)==' ')i--;
            int j=i;
            //Moving i till next gap
            while(i>=0 && s2.charAt(i)!=' ') i--;

            //Moving out of loop if i is less than 0
            //if(i<0) break;

            if(fnl.isEmpty()){
                fnl = fnl.concat(s2.substring(i+1,j+1));
            }
            else{
                fnl = fnl.concat(" "+s2.substring(i+1,j+1));
            }
            //I dont know how below i-- helps but it does prevent from the
            //infinite loop
            i--;
        }
        System.out.println(fnl);
    }
    
}
