class Person{
    // private String name;  // here instantiated vars are private hence no outer class can access it
    // private int age;

    Person(){
        System.out.println("Constructor call");
    }

    public void hello(){
        System.out.println("hello");
    }
}

class _21_anonymous_object{
    public static void main(String args[]){
        // Person p1 = new Person();
        // as above object creation have 2 steps
        // 1. Object creation in heap memory using constructor
        // 2. assigning reference of that object to the p1 var in stack

        // ****** Anonymous Object ******
        new Person();  // this is how we create Anonymous object as they are not referenced to any var hence we cannot access them 

        new Person().hello(); // still we can use them once
    }
}