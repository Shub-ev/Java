// typecasting => converting one data type into another exponentially

// Object typecasting
// upcastring  => converting base to super 
// downcasting => converting super to base

class A{
    protected void parent(){
        System.out.println("This is parent A");
    }
}
class B extends A{
    protected void parent(){
        System.out.println("This is parent B");
    }
    protected void child(){
        System.out.println("This is child");
    }
}

public class _30_upcasting_downcasting{
    public static void main(String args[]){
        double d = 12.123;
        // int a = d;      // this is not possible due to possibility of data loss
        int a = (int) d;  // typecasting => truncate fractional part

        A b = new B(); // this is valid but here typecasting is happening
        b.parent(); // this calls method of B even refered by A type
        // b.child();  // is not possible bcoz refered by A

        // A b = (A) new B();   (A) happens implicitly(behind the scenes)  =>>>   this is **** Upcasting **** as A is super of B

        // B obj1 = b;  this is not possible bcoz b is of type A now

        B obj1 = (B) b; // this is  **** Downcasting **** as we are converting super to sub
    }
}