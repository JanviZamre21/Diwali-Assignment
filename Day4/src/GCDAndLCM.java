import java.util.Scanner;

public class GCDAndLCM {
   
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

 
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

      
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        
        int gcd = findGCD(a, b);

        
        int lcm = findLCM(a, b, gcd);

       
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);

        sc.close();
    }
}
