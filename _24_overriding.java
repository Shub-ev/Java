// runtime polymorphism  =>  overriding
// implimenting sameNamed methods in both base class and child class(same signature and different defination) (and using one from child)


class A{
    void show(){
        System.out.println("This is SHOW method is A");
    }
}

class B extends A{
    void show(){   // here is we create obj of B and call b.show() it will find in its current class if not present then in its parent
        // this is implementation of method overriding
        System.out.println("This is SHOW method is from B");
    }
}

public class _24_overriding {
    public static void main(String args[]){
        A b = new B();
        b.show();
    }
}
