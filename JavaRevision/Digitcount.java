import java.util.*;
public class Digitcount {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        scn.close();
        /*Log of N with base 10 + 1 can be used to count the number of digits in the number, the logarithmic function is part of Math class*/
        int numOfdigits = (int) Math.log10(N)+1;
        System.out.println(numOfdigits+" are present in total.");
        int temp = N;
        int lastdigit = 0;
        do{ 
            ++lastdigit;
            temp /= 10;
        }
        while(temp!=0);
        System.out.println("Digits count using while loop: "+lastdigit);
    }
    
}
