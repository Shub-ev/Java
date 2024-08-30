// ******* String object *******
// in java String is not a primitive datatype but a Class 
// string objects are immutable and can not be modified
// as string is a Class and its use is through object and default value of objects is **** null **** string also

import java.util.Scanner;

public class _18_string {
    public static void main(String args[]){
        // in java String is a class (S is capital so obviously)
        String name = "Shubham";  // why not new String("Shubham");  // this is stored in heap as it is an object
        String nm = new String("Shubham"); // here nm and name are the reference to the string object   // this is stored in heap as it is an object

        // string support only one operator i.e. +  concatination
        System.out.println(name + " " + nm);
        
        // string object/class have build in methods which are available to use
        System.out.println(name.toUpperCase());

        // as string is immutable we can not change it 
        name = name + " Hello"; // then how is this okay??? // because here new string object is being created of this 2 strings and reference is assigned to name
        System.out.println(name);

        
        // ******* Stirng are immutable *******
        String str1 = "hello";  // both these variables references the same object
        String str2 = "hello";  // as there is string constant pool(heap memory) where all unique strings are stored, as hello is already in 
        //                      // string constant pool hence same string address is used by str2 in stack
        if(str1 == str2){
            System.out.println(new Boolean(true));
        }


        // ******* mutable String *******
        // there are two string classes to create mutable stings
        // A. StringBuffer
        // B. StringBuilder

        StringBuffer strB = new StringBuffer("Shubham");
        System.out.println(strB);
        strB.append(" Gharage");

        // String temp = strB; // this is not possible as strB is stringbuffer type while temp is of string

        String temp = strB.toString(); // this will return the string from stringBuffer var
        System.out.println(temp);

        // both stringbuffer and stringbuilder provides no string methods
        // both stringbuffer and stringbuilder are except 1 difference that StringBuffer is thread safe but StringBuilder is not
    }
}
