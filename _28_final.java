// final -> variable, method, class

class Person{
    final public void iam(){   // now this is a final method and can not be overriden by sub classes
        System.out.println("I am Person");
    }
}

final class Man extends Person{   // making this class final, now it can not be inherited
    // public void iam(){}    // this cannot be done as iam is final in base class
}

// class Boy extends Man{}   // now we can not extend final class Man

public class _28_final {
    public static void main(String args[]){
        // const int a = 20;       //   const is not present in java  (instead final)
        final int a = 20;          // now this var is const/final and can not be changed
        System.out.println(a);

        // a = 20;   // this gives error final keyword can not be assigned
    }
}
