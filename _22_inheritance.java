//Inheritance is one of the pillers of OOPs
// types of inheritance 

// A. Single Inheritance
// B. Multilevel    (a -> b -> c)
// C. Heirarchical

// X. Multiple Inheritance (can not be implemented)



// all these classes are compiled to independent files
class Living{ //****  Base Class  *****         //default access specifier
    void iAm(){
        System.out.println("I am Living Organism");
    }
}

class Animal extends Living{    //****  Child Class (level 1) ****
    String clan;

    Animal(String animal){
        super();
        this.clan = animal;
    }

    void iAm(){
        System.out.println("I am Living Organism, and a " + this.clan);
    }
}

class Human extends Animal{      //****  Child Class (level 2) *****    (this is multilevel)
    String gender;

    Human(String gender){
        super("Human");
        this.gender = gender;
    }

    void iAm(){
        System.out.println("I am Living Organism, and a " + this.clan + " and have " + this.gender + " gender");
    }
}

public class _22_inheritance {
    public static void main(String args[]){
        Living l1 = new Living();    // implimenting base/parent class Living
        l1.iAm();     // implement base class method

        Animal am = new Animal("Human");    // implemented class which is derived from base class
        am.iAm();

        Human hm = new Human("Male");   // implemented class which is derived from l1
        hm.iAm();
    }   
}