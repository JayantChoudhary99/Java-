import java.util.Scanner;

/**
 * primenumber
 */
public class primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;
        if (A < 2) {
            System.out.println("is not prime");
        }
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("is prime");
        } else {
            System.out.println("is not prime");
        }
    }
}