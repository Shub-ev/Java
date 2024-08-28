public class _12_bitwise_ope {
    public static void main(String args[]){
        // ******  Bitwise operator  ******
        // these are used to perform operations at bit level

        System.out.println(0b1001 & 0b1000); // Bitwise & AND operator  1 & 1 => 1 else 0
        System.out.println(0b1001 | 0b1000); // Bitwise | OR  operator  1 | 0 => 1 (if any is 1 then 1)
        System.out.println(0b1001 ^ 0b1000); // Bitwise ^ XOR operator  1 ^ 1 => 0  && 1 ^ 0 => 1 (only one then true)
        System.out.println(~0b1000);         // Bitwise ~ NOT operator  0 => 1   1 => 0
        System.out.println((-12 >> 1)); // Bitwise Right Shift operator 1100 >> 1  =  0110 (padding of 0)
        System.out.println((12 << 1)); // Bitwise Right Shift operator 1100 << 1  =  110000 (padding of 0)
        System.out.println((-12 >>> 1)); // Bitwise Unsigned Right Shift operator 1100 >>> 1  =  0110 (padding of 0)
    }
}
