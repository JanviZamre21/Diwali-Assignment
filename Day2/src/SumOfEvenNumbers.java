import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop to calculate sum of first n even numbers
        for (int i = 1; i <= n; i++) {
            sum += 2 * i; // 2, 4, 6, ...
        }

        System.out.println("Sum of first " + n + " even numbers = " + sum);

        sc.close();
    }
}
