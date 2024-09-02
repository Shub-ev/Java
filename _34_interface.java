// *****  Interface  *****
// types of interface
// A. Normal Interface          (one or more than one abstract methods)
// B. Functional Interface      (only one abstract method)
// C. Marker Interface          (interface with no methods)

interface A{  // interface is not class   // interface gives us structure of the class

    int age = 20;       // in interface all variables are *****  final and static  ***** by default
    String name = "My Name";

    // in Interface all methods are by default  **** public abstract ****
    void show();
    void tr();

}
interface X{
    void xMethod();
}

interface Y extends X{      // interface can also ***** extend ***** another interface

}

class B implements A, X{   // implement interface       // we can implement more that one interfaces (but in abstract class we can extend only one class) 
    // now here we have to implement all the methods from the interface else make class Abstract
    public void show(){
        System.out.println("Show method");
    }
    public void tr(){
        System.out.println("tr method");
    }

    public void tryInterfaceVars(){
        System.out.println(this.name);
    }
    public void xMethod(){
        System.out.println("xMethod");
    }
}

public class _34_interface {
    public static void main(String args[]){
        A inter;    // we can create reference of interface
        // A inte = new A();    // we can not instantiate interface

        // A intr = new A()      // we can use Anonymous class to implement interface for once
        // {
            
        // };

        B b = new B();
        b.tryInterfaceVars();

        System.out.println(A.name);
    }
}
