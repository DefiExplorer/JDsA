package Interfaces;

public abstract interface Youtuber {
    //By default it is abstract and public
    //By default variables are public static final
    public static final int one = 1;
    int two = 2; //same as above
    void makevideo();
    //Student has the Study method and we define Study method here too.
    //This is will not be a problem as the definition,
    //of the method is not defined in any of the interfaces.
    void study();
}
