import java.util.*;
public class Arrs {

    public static void arr(int[] a){
        System.out.println(Arrays.toString(a));
    }//This is for 1D array
    public static void arr2D (int[][] _arr) {
        System.out.println(Arrays.deepToString(_arr));
    }//This is for 2D array
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number of rows and columns: ");
        int N = scn.nextInt();
        int M = scn.nextInt();
        int K = 0;
        int[] x = new int[K];
        int[][] y = new int[K][K];

        int b = 1;
        if(N>0 && M>0){
            x= new int[N];//our 1 D array
            y= new int[N][M];//our 2D array
            b = M*N;
        }
        else if(N>0)
        {
            x= new int[N];
        }
        else{
            System.out.println("Inputs not allowed!");
            System.exit(1);//Stops further code execution
        }

        for(int i=0; i<N; i++){
            System.out.println("Enter elements for N: ");
            x[i]=scn.nextInt();
        }
        for(int j=0; j<N; j++){
            for(int k=0;k<M;k++){
                System.out.println("Enter elements for 2D MATRIX: "+b+" remaining");
                y[j][k]= scn.nextInt();
                b--;
            }
        }
        scn.close();
        arr(x);
        arr2D(y);
    }    
}
