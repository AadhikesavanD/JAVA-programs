import java.util.Scanner;

public class CheckPrimeInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check for prime numbers using two-pointer method
        System.out.println("Prime numbers in the array are:");
        int left = 0, right = n - 1;
        while (left <= right) {
            if (isPrime(arr[left])) {
                System.out.print(arr[left] + " ");
            }
            if (left != right && isPrime(arr[right])) {
                System.out.print(arr[right] + " ");
            }
            left++;
            right--;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}