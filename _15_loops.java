public class _15_loops {
    public static void main(String args[]){
        //while loop
        int i = 10;
        while(i-- > 0){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        
        // do while
        do{
            System.out.print(i + " ");
            i++;
        }while(i < 10);

        // for loop
        for(int j = 10; j > 0; j--){
            System.out.print(j + " ");
        }

        // advanced for loop for arrays
        int arr[][] = new int[3][3];
        System.out.println();
        for(int n[]: arr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
