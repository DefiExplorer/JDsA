import java.util.*;

public class Selectionsort {
    public static void selecsort(int[] arr){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int minInd = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd = j;
                }
                //Swapping using the index of min value which
                //gets assigned to 1st element and so on in
                //every iteration (2nd then 3rd then 4th...);
                int temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd]= temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of your Array- ");
        int size = scn.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of your array: ");
        for(int i=0;i<size;i++){
            a[i]= scn.nextInt();
        }
        scn.close();
        selecsort((a));
    }
}
//Selection Sort is more efficient than Bubble Sort.