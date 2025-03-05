
import java.lang.reflect.Method;

public class _50_classClass{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("Student").getClass();
        Method[] arr = c.getDeclaredMethods();
        for(Method m : arr){
            System.out.println(m.getName());
        }
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