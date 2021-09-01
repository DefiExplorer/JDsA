package Singleton;

public class AppConfig {
    //Default Constructor made private to avoid creating objects
    private AppConfig () {

    }
    //Now we create a single object that will be used multiple times as required
    //and no more objects will be created.
    //private static AppConfig obj = new AppConfig();
    //In above object gets created even if we have no use at present.
    //Above is ok, but to further optimise: -
    private static AppConfig obj = null;
    public static AppConfig getInstance(){
        //if block makes sure object only gets created in first call of method
        //because after that it will not remain null.
        if(obj == null){
            obj = new AppConfig();
        }
        return obj;
        //return type is class object, which is created only once
    }
}
