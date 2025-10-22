import java.util.Scanner;

public class LongestStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String[] arr = new String[n];

        // Input strings
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Find the length of the longest string
        int maxLength = 0;
        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Length of the longest string = " + maxLength);

        sc.close();
    }
}
