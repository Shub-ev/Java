// ******* Constructor Method *******
// Constructor is a special method which dont have any return type and have same name as class name
// it is used to create an object and set the instantiated variables
// this method is called every time we create an object


// each class in java is subclass of Object Class hence calling super in every constructor is valid 
class Person{
    private String name;  // here instantiated vars are private hence no outer class can access it
    private int age;

    // ***** Default constructor *****
    Person(){
        super(); // as each class is subclass of Object class hence super() // else put by compiler
        this.name = "";
        this.age = 0;
    }

    // ***** Parametarized constructor *****
    Person(String name, int age){ // this constructor accepts parameters
        super();
        this.name = name; // this is why "this" is imp
        this.age = age;
    }

    // ***** Copy constructor *****
    Person(Person p1){ // this constructor accepts another object of a Class
        super();
        this.name = p1.name; // this is why "this" is imp
        this.age = p1.age;
    }
}

public class _20_constructor {
    public static void main(String args[]){
        // Person p1 = new Person("Shubham");  // this is invalid all required values should be provided
        Person p1 = new Person("Shubham", 20);
        System.out.println(p1.toString());
    }
}
