
class Computer{
    public void show(){
        System.out.println("I am a Computer");
    }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("I am a Laptop");
    }
}

class Mobile{
    public void show(){
        System.out.println("I am a Mobile");
    }
}


public class _27_dynamic_method_dispatch {
    public static void main(String args[]){
        Computer com = new Laptop();  // here we are creating Laptop obj but referring it to Computer type (it is possible)
        // it is possible to create object of sub class and refer it to super class

        com.show();   // this prints i am laptop as we have obj of Laptop class

        com = new Computer();  // now com is referencing Computer obj
        com.show();    // hence i am computer


        // com = new Mobile();     // this is not possible bcoz com is of Computer/Laptop type bcoz they have inheritance 
        // Mobile dont have any relation with them so can not refer it 
    }
}
