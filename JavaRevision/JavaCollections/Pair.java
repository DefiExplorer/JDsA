package JavaCollections;

    //Suppose we have a pair class whose input type must be support more than two types.
    //So to construct such class we need to use generic Angle-bracket.
    //This lets our pair class to tell us what it has during runtime.
    //So, generics helps attain flexibility in datatypes.
public class Pair<x,y>{
        //The type of x and y is unknown in compile time.
        //Note x and y is not variable here, there replace with the dataytypes laterOn..
        //So, we can do this->
    x varX;
    y varY;
        
        //Constructor must be defined
    Pair(x varX,y varY){
        this.varX=varX;
        this.varY=varY;
    }
        
    void display(){
        System.out.println("("+varX+","+varY+")");
    }
}
