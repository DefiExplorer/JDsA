import java.util.*;
class Calculator{
    public static void main(String arga[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float a = scn.nextFloat();
        System.out.println("Enter second number: ");
        float b = scn.nextFloat();
        /*Note: The cursor moves step ahead if String or character
        input is after number(int or double or float) input, so we need
        to skip one line*/
        System.out.println("Enter the desired operations: ");
        scn.nextLine();
        char operation = scn.nextLine().charAt(0);
        scn.close();
        float result = 0;
        float remainder = 0;
        switch(operation){
            case '+':
                result = (a+b);
                
                break;
            case '-':
                result = (a-b);
                
                break;
            case '*':
                result = (a*b);
               
                break;
            case '/':
                result = (a/b);
                if(a>b){
                    remainder = a%b;
                }
                else{
                    remainder = b%a;
                }
                System.out.println("The remainder for divide operation is: "+ remainder);
                break;
            default:
                System.out.println("Invalid Input or operation");
        }
        System.out.println("Answer is: "+ result);
    }
    /*
    Merging switch cases--> Like this for similar outputs
    case 1:
    case 2:
        Sysem.out.println();
    
    */
}