// implementation of exeption

public class _39_exceptions_2 {
    public static void main(String args[]){
        int d = 0;
        // int res = 1234/d;    // as this exception is not handled so it will ne handled by default handler
        // which prints the stack trace and exception and terminates the program
        // Exception => ArithmaticException => '/ by zero'

        try{
            int res = 1234/d;
        }
        catch(Exception exp){
            System.out.println(exp.getMessage());
        }
    }
}
