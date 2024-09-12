// exceptions are nothing but runtime errors
// types of errors
// A. Compiletime Error
// B. Runtime Error (exceptions)
// C. Logical Error


// Object Class -> Throwable Class -> 1. Error      2. Exception
// 1. Error -> we cannot deal with errors (outofmemory)
// 2. Exception =>  RuntimeException, SQLException, IOException and more

// RuntimeException => ArithmaticException, IndexOutOfBoundException

public class _39_exceptions {
    public static void main(String args[]){
        int i = 2;
        int j = 8;

        int arr[] = new int[5];


        // handle different exceptions
        try{    // try block tries to execute something if exception occurs it throws exception object
            j = j / i;      // this generates   **** arithmatic exception (divide by 0) ****

            System.out.println(arr[5]);     // this generates **** array out of bound exception ****
        }
        catch(Exception e){     // catch block is compulsory to catch the exception thrown by try block
            if(e.getMessage().contains("out of bounds for length")){
                System.out.println("Index is out of limit");
            }
            else if(e.getMessage().contains("/ by zero")){
                System.out.println("Don't Divide by Zero");
            }
            else{
                System.out.println(e.getMessage());
            }
        }


        // *****   In this exception herarchy keep child exception at top and parent classes at bottom   *****
        // handle different exceptions
        try{    // try block tries to execute something if exception occurs it throws exception object
            j = 4 % 2;      // this generates   **** arithmatic exception (divide by 0) ****


            if(j == 0){  // here we want to call catch block of Arithmatic exception even there is no exception
                throw new ArithmeticException("I dont want j = 0");     // throwing the exception
            }

            // System.out.println(arr[5]);     // this generates **** array out of bound exception ****
        }
        catch(ArithmeticException e){       // specific arithmatic exception
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){        //specific array index exception
            System.out.println(e);
        }
        catch(Exception e){             // exception class if any exception instead above
            System.out.println(e);
        }
    }
}
