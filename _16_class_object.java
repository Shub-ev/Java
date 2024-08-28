// class is a structure/blueprint/mold which dosent occupy space on which/ using which objects are created
// object are the instances of class / implementation of the class

class Calculator{
    int a, b;

    Calculator(int num1, int num2){
        this.a = num1;
        this.b = num2;
    }

    int add(){
        return this.a + this.b;
    }
}

public class _16_class_object {
    public static void main(String args[]){
        Calculator cal = new Calculator(10, 20);
        System.out.println(cal.add());
    }
}
