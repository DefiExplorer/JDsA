package Questions;

import java.util.Arrays;
import java.util.Scanner;

//Helpful to use when we have sorted array, this is important concept which we will learn
//by solving a question.
/*Question: -
Given an array of N elements, your function findTriplets() must return true if the triplets exists in A[] whose sum is
also 0, else returns false.
*/
public class TwoPointerAlgo {

    public static boolean twoSum(int a[], int x, int i){
        //We make 2 Pointers, i points at first element and j at last element.
        //Assuming given a[] is sorted.
        int j = a.length-1;
        //int i=0;
        //TO SOLVE TRIPLET, we will need to get i as argument for our function too, since it changes
        
        while(i<j){
            if(a[i]+a[j]>x){
                j--;
            }
            if(a[i]+a[j]<x){
                i++;
            }
            else{
                return true;//When they are equal
            }
        }
        //In case while loop doesn't return true.
        return false;
    }
    /*Using twoSum we find ThreeSum, starting from index 0, check if sum of 2 nos. in the remaining
    array is equal to negative of array[0]....and so on.
    */
    public static boolean findTriplets(int arr[], int n){
        //Using 3 for loops it can be solved easily in O(n^3) time complexity, so instead we
        //follow a different approach: -
        //We sort the give array first using built-in function for arrays which sorts in O(nlogn) time.
        boolean ans = false;
        if(arr!=null){
            Arrays.sort(arr);
            for(int i=0;i<n-2;i++){
                //x = negative of number.
                //It will start in remaining array, so index is i+1...from 2nd element.
                if(twoSum(arr, -arr[i], i+1)){
                    ans = true;
                }
            }
            return ans;
        }
        else{
            return ans;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of test cases.");
        int T = scn.nextInt();
        int n[]= new int[T];

        System.out.println("Enter the length of arrays for "+T+" cases.");
        
        for(int o=0;o<T;o++){
            n[o] = scn.nextInt();
        }
        int indexOfn =0;
        while(indexOfn<T){
            int p = n[indexOfn];
            int arr[] = new int[p];
            System.out.println("Enter "+p+" numbers for your array.");
            for(int i=0; i<p; i++){
                arr[i]=scn.nextInt();
            }
            if(findTriplets(arr, p)){
                //This function takes array and array size.
                System.out.println("Yes it has triplet with sum zero.");
            }
            else{
                System.out.println("No such triplets.");
            }
            indexOfn++;
        }
        scn.close();
    }
}
