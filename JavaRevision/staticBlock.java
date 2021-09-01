class staticBlock{
    static {
        System.out.println("In block 1.");
    }
    static {
        System.out.println("In block 2.");
    }
    public static void main(String[] args){
        //Simply run this to see that the static blocks
        //are executed before main.
        System.out.println("Inside main.");
    }
    static {
        System.out.println("In block 3.");
    }
}