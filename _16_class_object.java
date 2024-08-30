// class is a structure/blueprint/mold which dosent occupy space on which/ using which objects are created
// object are the instances of class / implementation of the class

class Calculator{
    int a, b, c, d;

    Calculator(int num1, int num2){
        this.a = num1;
        this.b = num2;
    }

    Calculator(int num1, int num2, int num3){ // method/constructor overloading same method name but different parameters
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }

    int add(){
        return this.a + this.b;
    }
    // int add(){     // this will not work as even the body is different signature is same
    //     return this.a + this.b + this.c;
    // }
}

public class _16_class_object {
    public static void main(String args[]){
        Calculator cal = new Calculator(10, 20);
        System.out.println(cal.add());
    }
}
