abstract class Person{
    String name;
    int age;

    Person(){};

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int roll;
    int marks;

    Student(String name, int age, int roll, int marks){
        // super(name, age);
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("roll=").append(roll);
        sb.append(", marks=").append(marks);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

class Try{
    public static void main(String[] args) {
        Student s = new Student("Shubham", 21, 2253013, 99);
        System.out.println(s);
    }
}