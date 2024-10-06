// used to create vars and methods which are not associated with instance of the class but the class itself

// rules for static methods
// 1. static methods can not access nonStatic/instance vars 
// 2. static methods can not call nonStatic methods 
// 3. static methods can not refer this or super()

class Example {
    static int count = 0;  // static variable
    private int t = 10;

    static void displayCount() {  // static method
        System.out.println("Count: " + count);

        // System.out.println(this.t); // 1.this is not available to static method 2.can not make static ref to not-satic
    }
}

public class _45_static {
    public static void main(String[] args) {
        Example.count += 4;     // we can access static var of a class directly and can modify it
        
        Example.displayCount(); // we can access static method of a class
    }
}

