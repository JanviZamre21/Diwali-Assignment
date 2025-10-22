import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;

       
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

      
        for (int i = 1; i <= r; i++) {
            
            for (int j = r; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
