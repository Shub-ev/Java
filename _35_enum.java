// enum creates collection of constants

// enum extends enum class hence we get no. of default methods
enum Status{        // here Status (enum) is a class but we can not extend it
    Success, Failed, Running, Pending;      // all these are objects of status
}

public class _35_enum {
    public static void main(String args[]){
        // using Status class

        Status s = Status.Running;
        System.out.println(s);

        System.out.println(s.ordinal());  // .ordinal() prints the number of constant within enum
        
        // how to get all constants in one array
        Status[] arr = Status.values(); // .values() returns array of Status[] 
        for(Status i : arr){
            System.out.println(i);
        }


        // enum in if else 
        if(s == Status.Running){
            System.out.println("Server is Running");
        }
        else if(s == Status.Failed){
            System.out.println("Server connection Failed");
        }


        // switch supports enum
        switch(s){
            case Running:
                System.out.println("Server Running");
                break;
            case Failed:
                System.out.println("Server Running");
                break;
            case Pending:
                System.out.println("Server Running");
                break;
        }
    }
}
