class A{
    protected int a;

    A(){
        System.out.println("Inside Constructor!");
    }

    {
        System.out.println("Inside block!");
    }

    static {
        System.out.println("Inside Static block!");
    }

    A(int a){
        this.a = a;
    }
}

class Try{
    public static void main(String args[]){

        A a = new A();
        A b = new A();

        System.out.println(a.a);
    }
}