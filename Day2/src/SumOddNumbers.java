import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i + 1; // 1, 3, 5, ...
        }

        System.out.println("Sum of first " + n + " odd numbers = " + sum);
        sc.close();
    }
}
