public class Bitwiseop {
    public static void main(String[] xyz){
        //Bitwise operators are & | >> <<
        //Logical operators are && || (AND OR)
        int a = 10;
        int b = 13;
        int c = b << 1; //Left-shift, value becomes 2x with floor value
        int d = a >> 1;
        System.out.println(c);
        System.out.println(d);
    }
}
/*We can use the & operator with boolean or numeric types
but && can only be used with boolean operands.
Using it with integer operands results in a compilation error.
The & operator always evaluates both expressions,
whereas the && operator evaluates the second expression only if the first one is true
& compares each operand bitwise, whereas && operates only on booleans
*/