import java.util.Scanner;

// Wheel Factorization

public class primenumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = isPrimeOptimized(num);
        if (result) {
            System.out.println("is prime number");
        } else {
            System.out.println("is not prime number");
        }
    }

    public static boolean isPrimeOptimized(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int sqrtNum = (int) Math.sqrt(num) + 1;
        for (int i = 5; i <= sqrtNum; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
