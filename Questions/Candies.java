package Questions;
//Question based on greedy approach
import java.util.*;
public class Candies{
    //Our method:
    static long candies(int n, int[] arr){
        int can[] = new int[n];
        Arrays.fill(can, 1); //We can use this to fill 1 in every box.
        //array size must be equal to number of child
        //We compare rating of 2 adjacent childs.
        int i=0;
        //i from idex 0 and j from index 1
        for(int j=1;j<n;j++){
            System.out.println("At index (i,j): ("+i+","+j+").");
            //We move from left to right, initally all have 1 candies
            if(arr[j]>arr[i]){
                //if rigth is more than left
                //it get 1 more than left.
                can[j]=can[i]+1;
            }
            i=j;
        }
        for(int j=n-1;j>0;j--){
            //Now we move from right to left
            if(arr[j-1]>arr[j]){
                //if left is more than rigth
                //it get 1 more than left
                can[j-1]=Math.max(can[j]+1,can[j-1]);
            }
        }
        
        //Counting candies:
        long count=0;
        for(int item:can){
            count+=item;
        }
        return count;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int x=0;x<n;x++){
            System.out.println("Enter the rating of student:"+(x));
            arr[x]=scn.nextInt();
        }
        scn.close();
        //System.out.println(arr.length);
        long result = candies(n,arr);
        System.out.println(result);
    }
    //https://www.hackerrank.com/challenges/candies/problem?h_r=internal-search
}
