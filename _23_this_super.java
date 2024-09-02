// every constructor in java have super method even you don't mention it
// this super() method is called first when we call any constructor


class A{
    A(){
        // super()  is called first here (from Object Class)
        System.out.println("In A Constructor");
    }
}

class B extends A{
    B(){
        // super() this super() default method is implemented even we don't specify here
        System.out.println("In B Constructor");
    }
    B(int num){
        this();   //  this() call the default constructor of this Class
        System.out.println("In B int Constructor");
    }
}

public class _23_this_super {
    public static void main(String args[]){
        // A a = new A(); //  creating a object of A class  (print 1 statement )
        // B b = new B(); //  creating b Object of B class derived from A class  (prints constructor of A then constructor of B) 
        B b1 = new B(2);
    }
}
