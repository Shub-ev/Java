import java.util.Scanner;

public class DecimalToBinary{
    private static void decimalToBinary(int num){
        String res = "";
        while(num != 0){
            res += num%2 + "";
            num /= 2;
        }
        
        System.out.println(res);
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        decimalToBinary(num);
    }
}