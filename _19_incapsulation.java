// ******* Encapsulation *******

// here we have encapsulated varibles and methods in single class entity and once implemented we 
// have to access it using that instance only

// encapsulation is implemented using access specifiers
// to implement Encapsulation we have access specifiers through which we can restrict external access to unwanted members
// A. Private   (access with in the same class only)
// B. Public    (access from any other class regardless of package)
// C. Protected  (access with in all classes of same package or subclasses which could be in other packages)
// D. Default/no modifier   (limits the visibility to classes with in the same package)

class Person{
    private String name;  // here instantiated vars are private hence no outer class can access it
    private int age;
    private int accNo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;    // here parameter name and instantiated variable name is same and to avoid confution we use this(keyword which represent current object    )
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}

public class _19_incapsulation {
    public static void main(String args[]){

    }
}
