// ******  Inner Class  ******
// if there is a need of a class for specific class only we can declare inner class

class A{    // we cannot create outer class static 
    public void showClass(){
        System.out.println("In class A");
    }

    class B{        // Inner class B of class A
        public void inner(){
            System.out.println("In class B");
        }
    }

    static class C{        // Inner class B of class A
        public void inner(){
            System.out.println("In class C");
        }
    }
}


public class _33_innerClass {
    public static void main(String args[]){
        A a = new A();
        a.showClass();

        // B b = new B();       // this is not possible as B is not available and part of A 
        // A.B ab; // this is legal nut ****  A.B ab = new A.B();  **** is not allowed bcoz B() is a part of object of A
        // hence to create an object of B we have to use object of A

        A.B ab = a.new B();  // creating obj of B using obj of A bcoz B is non static class and limited to each instance of A
        ab.inner();

        A.C ac = new A.C();  // this is valid bcoz C belong to A class not its instances hence we can direclty implemente av by A.C();
        ac.inner();
        // after compilation compiled class of inner class will be      =>  A$
        


        // *****   Anonymoous Inner Class   *****
        // what if we want to change the behaviour of showClass() of A without inheritance
        A innerClass = new A()  // this creates new class file named    **** _33_innerClass$1.class **** as this dont have name it is Anonymoous inner Class
        {
            public void showClass(){  // we can increase the visibility but we can not decrease as compared to parent class
                System.out.println("In new showClass()");
            }
        };
        innerClass.showClass();
    }
}
