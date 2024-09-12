class MyException extends Exception {
    public MyException() {
        super("MyException occurred");
    }

    public MyException(String message) {
        super("MyException occurred: " + message);
    }
}

class AnotherException extends Exception {
    private String message;

    public AnotherException(){
        this.message = "Another Exception Occured";
    }

    public AnotherException(String message){
        this.message = "Another Exception Occured" + message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class _40_custom_exception {
    public static void main(String args[]) {
        try {
            int j = 4/2;

            if(j%2 == 0)
                throw new AnotherException("Custom error message");
            else
                throw new MyException("Message from me");
        }
        catch (AnotherException e){
            System.out.println(e.toString());
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());  // This will print the message passed to the constructor
        }
    }
}