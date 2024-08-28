import java.util.Scanner;

public class _14_switch_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        sc.close();

        // traditional switch statement
        switch (day) {
            case "monday":
                System.out.println("Today is monday");
                break;
            case "tuesday":
                System.out.println("Today is tuesday");
                break;
            case "wednesday":
                System.out.println("Today is wednesday");
                break;
            case "thursday":
                System.out.println("Today is thursday");
                break;
            case "friday":
                System.out.println("Today is friday");
                break;
            case "saturday":
                System.out.println("Today is saturday");
                break;
            case "sunday":
                System.out.println("Today is sunday");
                break;
        
            default:
                System.out.println("Enter Valid Day");
                break;
        }

        //new switch statement 
        String res;
        switch (day) {
            case "monday", "saturday" -> res = "Hello";
            case "sunday", "wednesday" -> res = "Bye";
            default -> res = "Enter valid Input";
        }
        System.out.println(res);

        // switch now returns
        String res2;
        res = switch (day) {
            case "monday", "saturday" -> "Hello";
            case "sunday", "wednesday" -> "Bye";
            default -> "Enter valid Input";
        };
        System.out.println(res);
    }
}
