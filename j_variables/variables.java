public class variables{
    public static void main (String [] args){
        // type variableName = value; 

        String name = "Jhon";
        int age = 19; 
        System.out.println(name + " " + age);

        //Final Variables 

        /* 
        Final Variables: 
        if you don't want others to overwrite(exisiting values) which are defined by you, use final keyword! */

        final int myNum = 13;
        // myNum = 12;  // throws an error, cannot assing a value to final variable
        System.out.println(myNum);

        //Other datatypes ; 

        int myInt = 19; 
        float myFloat = 4.99f; 
        char myLetter = 'D';
        boolean myBool = true; 
        String myText = "Hello";
    }
}
