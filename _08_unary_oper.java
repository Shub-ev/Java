public class _08_unary_oper {
    public static void main(String args[]){
        // ******  Unary operators  ******
        
        // singel operator and operand
        int a = 10;

        System.out.println(-a); // - Unary minus
        System.out.println(!true); // !  Not operator
        System.out.println(a++); // ++ increment (post)
        System.out.println(++a); // ++ increment (pre)
        System.out.println(a--); // -- decrement (post)
        System.out.println(--a); // -- decrement (pre)

        System.out.println(~a); // ~ bitwise not operator
    }
}
