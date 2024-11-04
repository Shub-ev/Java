public class _11_ternary_ope {
    public static void main(String args[]){
        // ******  Ternary operator  ******
        // Exp1 ? Exp2 : Exp3
        // if Exp1 is true then result of expression is the value of Exp2 
        // if Exp1 is false then result of expression is the value of Exp3
        String a = "Hello";
        int c = 10;
        System.out.println((c < 5 ? a = "Bye" : "Bye"));
        System.out.println(a);
    }
}
