// abstract method is => ( declared in abstract class only. but implemented in subclass & must be implemented ))
// abstract class => holds abstract methods
// concrete class => class which we can instantiate

abstract class Person{      // we cannot instantiate abstract class directly, instead we can use ****  Anonymous Inner Class  ****
    abstract void dance(); // abstract method is implemented only in abstract class and must be implemented in subclass
    abstract void flying();

    public void iam(){
        System.out.println("I am Abstract Class");
    }
}

abstract class Dancer extends Person{  // as here we have to implement flying() but we dont want to so we will make this class abstract
    // here Dancer class should implement abstract method or ERROR
    void dance(){   // this is the implementation of abstract method of abstract class
        System.out.println("Dancing");  
    }
}

class Mutant extends Dancer{        // concrete class

    @Override
    void flying() {
        System.out.println("Mutant is flying");
    }
    
}

class _32_abstract{
    public static void main(String args[]){
        // Person p1 = new Person();      // can not instantiate abstract class

        Person p1 = new Mutant();  // but we can Upcast to abstract class
        p1.dance();  // accessing dance() method of Dancer class
        p1.iam();    // implementing iam()


        // *** implementing abstract class using Anonymous Inner class ***
        // Person p = new Person();  // this is now allowed as we can not directly instantiate  abstract class  instead
        Person p = new Person()
        {
            public void flying(){
                System.out.println("I am flying");
            }
            public void dance(){
                System.out.println("I am Dancing");
            }
        };      // here we are not instantiating Person instead we are using another class Anonymous class to implement abstract class
    }
}