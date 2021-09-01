package Throwables;
public class Excep{
    public static void main(String args[]){
        fun1();
    }
    //This way we handle exception in method or function itself but not in main.
    static void fun1(){
        int a=5;
        int b=3;
        int c=a/b;
        System.out.println(c);
        //fun1 calls fun2, which handles error.
        //fun2();
        //Handling our exception, here....so fun2() must be inside the try-catch block
        try{fun2();
        }catch(Exception e){
            System.out.println(e.getMessage()+" error occured.");
        }finally{
            System.out.println("Cat is present no matter what.");
        }
    }
    //remember throws keyword is used after the method with exception type.
    static void fun2() throws ArrayIndexOutOfBoundsException{
        //throws just says function may give the above error
        boolean isDanger=true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger coming");
        }
    }

}