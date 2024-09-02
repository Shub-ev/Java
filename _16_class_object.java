// class is a structure/blueprint/mold which dosent occupy space on which/ using which objects are created
// object are the instances of class / implementation of the class

// in creating an object
// 1. class is loaded in class loader
// 2. static block executes (once for each class)
// 3. constructor are created / objs are created

// class load process is only starts if we instantiate any object
// but if we want to load class explicitly -> forName()

class Calculator{
    int a, b, c, d;  // these are instance variables (heap memory)
    // instance vars are created outside the methods, blocks or constructs but available to methods, blocks or constructs
    // these are created when object is instancetiated

    // creating class member using static
    // static saves memory as there is single common static member for all objs
    // instead of initializing static var here we will initialize it in static block
    static int comm; // this is static variable which will be stared and will remain same for all objects

    Calculator() {}; // default

    Calculator(int num1, int num2){  // in java each method/function have its own stack while execution
        this.a = num1;
        this.b = num2;
        System.out.println("Inside constructor block");
    }

    Calculator(int num1, int num2, int num3){ // method/constructor overloading same method name but different parameters
        this.a = num1;
        this.b = num2;
        this.c = num3;
        System.out.println("Inside constructor block");
    }

    int add(){ // this is an instance method and to call this we required an instance of class
        return this.a + this.b;
    }

    static int staticMembers(Calculator cl){ // we can take the reference of the obj as parameter
        // this.a;  // we can not use non-static/instantiated vars in static method as these are associated with specific objects only
        System.out.println(cl.b); // we can reference instantiated vars only if we have reference to that object
        return comm; // we can not use this.comm in static method
    }
    // int add(){     // this will not work as even the body is different signature is same
    //     return this.a + this.b + this.c;
    // }


    // ******  Static Block in Class  ******
    // this static block executes only once and used to initialize static variables
    // static block will execute before Constructor
    static
    {
        comm = 10;
        System.out.println("Inside static block");
    }
}

public class _16_class_object {
    public static void main(String args[]){
        Calculator cal = new Calculator(10, 20);
        System.out.println(cal.comm); // static var will be same for all objs but it shouldn't be accessed by obj name instead
        System.out.println(Calculator.comm); // static vars should be accessed using Class itself
        System.out.println(cal.add());
        // cal.staticMembers(); // this is possible but avoided
        Calculator.staticMembers(cal); // this is how we should access the static method of class
    }
}
