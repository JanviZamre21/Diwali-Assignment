import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

     
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int temp = n; 

   
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;         
            temp /= 10;            
        }

        System.out.println("Sum of digits of " + n + " = " + sum);

        sc.close();
    }
}
