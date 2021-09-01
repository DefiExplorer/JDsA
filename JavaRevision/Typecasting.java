class Typecasting{
    public static void main(String args[]){
        /*Left type can be type casted to right ones
        "byte--short--char--int--long--float--double"
        -This is Automatic TypeCasting
        -Reverse of this (Right to any of the left) is Manual TypeCasting
        Boolean can't be typecasted
        */
        //Auto
        byte x = 5;
        int y = x;
        System.out.println(y);
        //Manually
        double m = 7.61;
        int n = (int) m;
        double o = (double) 13/2;
        System.out.println(n);//The floor value gets printed that is 7.
        System.out.println(o);//Again floor value without decimal nos.
        float p = (float) 2.89f;//Double to float using f postfix.
        //Java treats decimal by default as double so typecast is req.
        System.out.println(p);
    }
}