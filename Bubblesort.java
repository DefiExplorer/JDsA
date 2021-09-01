import java.util.*;
public class Bubblesort {
    //Function for bubble sort:
    public static void bubblesort(int[] arr, char xyz){

            //Optimisations:
            //1. Bubble sort can be optimised by running (arr.length-1-i) times
            //for inner loop condition.
            //Doing this doesnt check values that are already sorted.
            //2. Check if already sorted
        boolean sorted = true;
        
        switch(xyz){
            case '<':
                for(int i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                    //Ascending Order 
                        if(arr[j]>arr[j+1]){
                            int temp = arr[j+1];
                            arr[j+1]=arr[j];
                            arr[j]=temp;
                            sorted = false;
                        }
                    }
                    if(sorted){
                        System.out.println("Array already sorted!");
                        break;
                    }
                }
                break;
            case '>':
                for(int i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                            //Decending order
                        if(arr[j]<arr[j+1]){
                            int temp = arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            sorted = false;
                            break;
                        }
                    }
                    if(sorted){
                        System.out.println("Array already sorted!");
                        break;
                    }
                }
                break;
                
        }
        //Printing the new array using "Enhanched for loop":
        //for x in array we print x
        for(int x: arr){
            System.out.print(x+"\t");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an Array, then its elements: ");
        int size = scn.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            a[i]= scn.nextInt();
        }
        scn.nextLine();
        System.out.println("Enter the desired order: > or < : ");
        char option = scn.nextLine().charAt(0);
        scn.close();
        bubblesort(a,option);
    }
}
//!!----------------------------------------xx---------------------------------The above code may have few errors---------------------------------xx-------------------------------!!