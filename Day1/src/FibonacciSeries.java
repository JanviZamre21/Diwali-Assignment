import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long a = 0, b = 1;
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
