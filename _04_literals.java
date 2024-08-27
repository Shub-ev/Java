// literals are the fixed values in the source code
// int a = 123  // here 123 is literal
// in lexical analysis literals are known as tokens
// literals are directly assigned to the variable is source code

// types of literals
// A. String literals (String name = "Shubham")
// B. character literal (char a = 'a')
// C. integer literal (int a = 123)
// D. boolean literal ( boolean bool = true )

..incomplete

public class _04_literals{
    public static void main(String args[]){
        // ******  integer literals  ******
        // A. Decimal literals
        int intNum = 1234;  // -ve or positive number made by combinations of (0-9) numbers
        int octals = 012; // octal literal represents octal numbers -> suffix 0
        int hex = 0xFF; // hex literal represents hexadecimal numbers -> suffix 0x
        int bin = 0b1001; // binary literal represents binary numbers -> suffix 0b

        System.out.println(intNum);
        System.out.println(octals);
        System.out.println(hex);
        System.out.println(bin);
    }
}