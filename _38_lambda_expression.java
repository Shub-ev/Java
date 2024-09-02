// lambda expressions are used to reduce the code

// *****  lambda expression works only with functional interface  *****

@FunctionalInterface      // SAMI -> Single Abstract Method Interface
interface A{
    void A();   // public abstract is implicit
}

@FunctionalInterface
interface B{
    void B(int i);   // method with parameter
}

@FunctionalInterface
interface C{
    int C(int i);   // method with return value
}


public class _38_lambda_expression {
    public static void main(String args[]){
        A a = () ->             // lambda expression reduces the code
        {
            System.err.println("Inside Anonymous function A");
        };
        a.A();

        B b = (i) -> System.out.println("Inside Anonymous function B value  -> "+i);  // no class file for anonymous class is created
        b.B(20);

        C c = (i) -> i+i;   // no need of { return (i + i); }
    }
}
