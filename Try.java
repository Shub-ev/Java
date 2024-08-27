class Try{
    public static void main(String args[]){
        Person p1 = new Person("Shubham");
        p1.displayName();
    }
}

class Person{
    String name;

    public Person(String nm){
        this.name = nm;
    }

    void displayName(){
        System.out.println("My Name is : "+this.name);
    }
}