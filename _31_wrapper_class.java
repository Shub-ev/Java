// java is about 99% OOP but primitive data types are not objects (ex. int float char) hence it is not purely object oriented

// for performance bcoz if primitives was object
// 1. consume heap memory
// 2. consume stack mem
// 3. more processing/overhead


// for certain frameworks only objects are supported ex. Collection frameword
// we have can use *****  Wrapper Class  *****

// i.e.
// int => Integer
// float => Float

public class _31_wrapper_class {
    public static void main(String args[]){
        int a = 10;  // primitive non object datatype
        Integer ac = 123;  // this is wrapper class and OOP based implementation of integer
        // also can be Integer ac = new Integer(123); but constructor Integer() is deprecated 

        Integer ab = new Integer(a); // this is *****  Boxing  ***** as we are storing primitive value in Wrapper class
        // as constructor is depricated now we can directly assign primitive to wrapper and Boxing will done automatically
        Integer aa = a;     // primitive to wrapper using Boxing/ AutoBoxing


        int in = ab.intValue(); // this is *****  UnBoxing  ***** as assigning Integer object to int
        in = ab;        // this is also valid here *****  AutoUnBoxing  ***** happens


        System.out.println(a);
        System.out.println(ac);
    }
}
