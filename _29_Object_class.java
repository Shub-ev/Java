// in java each class have a parent class called Object Class which have build in no of methods 

class Person{
    // public String toString(){     // here we are overriding toString method of Object class
    //     return "Hello";
    // }
}

public class _29_Object_class {
    public static void main(String args[]){
        Person p1 = new Person();
        // now even Person class have nothin we can see no of methods if we do p1.
        // these methods are from Object class which is extended by Person class by default

        System.out.println(p1);  // prints Class name and hash value of object (uses tostring() of Object class) 
        // as this method is present in the parent class 
    }
}
