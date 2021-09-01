public class StrMethods {
    public static void main(String args[]){
        //Since Strings are immutable, each operation below
        //gives new String if chances are made
        //the old String remains as it is.
        /*Type      Method
        char        charAt(int index)
        int         length()
        String      substring(int beginIndex)
        String      substring(int beginIndex, int endIndex)
        boolean     contains(CharSequence s)
        boolean     equals(Object another)
        boolean     isEmpty()
        boolean     isBlank()
        String      concat(String str)
        String      replace(char old, char new)
        String      repeat(int n)
        String[]    split(String regex)-- Note use "" not '' --> str.split(",");
        --Few more methods
        int         indexOf(int ch) -- Returns -1 if that char is not present
        String      toLowerCase()
        String      toUpperCase()
        String      trim() --Removes spaces from front and end.
        */
        String s = "Hello I am Rahul Raj. Student at VIT Bhopal studying Java.";
        String s1 = "Money";
        //Get the indexed character
        System.out.println(s.charAt(40));
        int len = s.length();
        String sub1 = s.substring(6);
        //beginIndex Inclusive
        String sub2 = s.substring(6, 16);
        //endIndex exclusive
        System.out.print(len+"\n"+sub1+"\n"+sub2+"\n");
        //Check if our String cointains given substring or character-->Returns true or false
        System.out.println(s.contains("VIT"));
        //We already know how == and .equals() differ becoz of Memory Design for Strings
        //------x------//

        System.out.println(s.isBlank());
        //Both does the same check
        System.out.println(s.isEmpty());
        //Concatenation: Joins 2 Strings together
        System.out.println(s.concat(" I Love CSE"));
        //Replaces all similar occurences of given char in whole string:
        System.out.println(s.replace('V','v' ));
        // Simply repeats the same String for n times without space,
        // or we can say concats the same string for n times.
        System.out.println(s1.repeat(2));
        //repeat does the below operation for n times in loop
        System.out.println(s1.concat(s1));
        //Spliting Strings using Regex:
        //Suppose user inputs car companies seperated by comas, we want to
        //get those names and store it into an array or list or any other data structure
        String company = "Maruti,Tata,Hyundai,Toyota,Mercedes,Nissan";
        String allCompany[] = company.split(",");
        for(String item: allCompany){
            System.out.println(item);
        }
        System.out.println();
        /*Trying to print the index of all A in given string
        and the remaining string after removing that character*/
        String str = new String("AbAbbAbbbA");
        int x = str.length();
        String str1 = str;
        for(int i=0;i<x;i++){
            int y = str1.indexOf("A");
            System.out.println(y +" "+ str1);
            char ab = str1.charAt(y);
            str1 = str.replace(ab,'b');
            str1 = str;
        }
        //The above code snippet doesnt work because the method indexOf()
        //only considers the first occurence of given character
        //and since Strings are imutable
        
    }
}
