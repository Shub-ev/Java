// functional interface is interface having only a single method

@FunctionalInterface  // this is Annotation     // this helps to keep only one method in SAMI
interface A{   // SAM -> Single Abstract Method Interface
    void show();
}

public class _37_functional_interface {
    public static void main(String args[]){
        //implementing interface using Anonymous class
        A a = new A() {
            public void show(){
                System.out.println("This is Anonymous Class");
            }
        };
        a.show();
    }
}
