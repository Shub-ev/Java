// datatypes are the type of data a variable can hold

// A. Integer -> 
//              1. byte  (1 byte -> -2^7 to 2^7-1)
//              2. short (2 byte)
//              3. int (4 byte)  // default 
//              4. long (8 byte) // syntax = long name = 1234l;

// B. Float -> 
//              1. float  (4 byte) syntax = float name = 2.5f;
//              2. double (8 byte) default;

// C. Char ->
//              1. char (2 byte) bxoz support Unicode syntax = char name = 'a';

// C. Boolean ->
//              1. boolean (1 byte / 1 bit not precisely defined) syntax = bool name = true/false;

public class _03_data_types {
    public static void main(String args[]){
        // ****  Primitive Data Types (Built in) ****

        byte by = 127; // 128 is not allowed as out of range 
        short shrt = 12345;
        int it = 12345678;
        long lng = 12345l; // l is compulsory

        float flt = 124.55f; // f is compulsory bcoz by default it is *** double ***
        double dbl = 123.123;

        char a = 'a';
        boolean bln = true;
        
        System.out.println(by);
        System.out.println(shrt);
        System.out.println(it);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(a);
        System.out.println(bln);
    }
}
