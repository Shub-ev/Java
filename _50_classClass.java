import java.lang.reflect.Method;

public class _50_classClass{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("Student");
        Method[] arr = c.getDeclaredMethods();
        for(Method m : arr){
            System.out.println(m.getName());
        }

        Student s1 = new Student();
        Class c1 = s1.getClass();
        Student s2 = new Student();
        Class c2 = s2.getClass();

        System.out.println(c1 == c2);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class Student{
    public String getName(){
        return null;
    }
    public int getRollNo(){
        return 10;
    }
}