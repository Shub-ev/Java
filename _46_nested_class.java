    // Nested Class : class within another class
    // scope of nested class is bounded by scope of enclosing class

    // i.e. if B is in A then B is known to A only not outside of A;
    // 1. B have access to private and other members of class A
    // 2. but A dont have access to the members of B

    // two types of nested class
    // 1. static 
    // 2. non-static (inner class)

    // 1. static 
    // static class class_name{}
    // due to static 


    public class _46_nested_class{
        private int a;

        _46_nested_class(){
            this.a = 10;
        }

        InnerClass obj_innerClass(){
            InnerClass inner = new InnerClass();
            // System.out.println(in_a);    // in_a is not accessible to outer class

            return inner;
        }

        class InnerClass {
            int in_a = 10;      // all outer class members are accessed by inner class but opposite is not always true
            // Static members are not allowed in a non-static inner class.
            // static int in_stat = 10; // This is incorrect.

            void show_outer_data(){
                System.out.println(a);
            }
        }

        public static void main(String[] args) {
            _46_nested_class outer = new _46_nested_class();

            _46_nested_class.InnerClass inner = outer.new InnerClass(); // syntax to instantiate inner class
            inner.show_outer_data();

            _46_nested_class.InnerClass inner2 = outer.obj_innerClass();
            inner2.show_outer_data();
        }
    }