import java.util.Scanner;

public class _14_switch_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        sc.close();

        switch (day) {
            case "monday":
                System.out.println("Today is Monday");
                break;
            case "tuesday":
                System.out.println("Today is Monday");
                break;
            case "wednesday":
                System.out.println("Today is Monday");
                break;
            case "thursday":
                System.out.println("Today is Monday");
                break;
            case "friday":
                System.out.println("Today is Monday");
                break;
            case "saturday":
                System.out.println("Today is Monday");
                break;
            case "sunday":
                System.out.println("Today is Monday");
                break;
        
            default:
                System.out.println("Enter Valid Day");
                break;
        }
    }
}
