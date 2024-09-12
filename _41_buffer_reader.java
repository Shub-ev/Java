import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _41_buffer_reader {
    public static void main(String args[]) throws IOException {
        System.out.println("Hello World!"); //println class belongs to PrintStream class


        // Taking input from user
        // 1. System.in.read()      // reads one char at time and saves ASCII
        // int num = System.in.read();  // read() reads int inputs(1 character)  && saves the ASCII values
        // System.out.println(num);


        // 2. BufferedReader class
        InputStreamReader in = new InputStreamReader(System.in);     // inputStreamReader takes the input of InputStream
        BufferedReader bf = new BufferedReader(in);     // buffered reader takes the object of InputStreamReader

        int n = Integer.parseInt(bf.readLine());  // returns String       // cannot use (int) as we cannot cast from String => int
        System.out.println(n);

        bf.close();   // closing BufferedReader is good => resource leak


        // 3. Scanner Class 
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        System.out.println(n2);

        sc.close();

        try{
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader bf2 = new BufferedReader(ir);
        }
        // finally block mostly used to close the resources
        finally{        // we dont have to make catch block compulsory we can use finally instead // but it will not handle exception
            bf.close(); // we can use final for such operations
        }
    }
}
