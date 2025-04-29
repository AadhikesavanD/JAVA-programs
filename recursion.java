import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printSubarrays(arr, 0, 0);
    }

    public static void printSubarrays(int[] arr, int start, int end) {
        // Base case: if end exceeds array length, return
        if (end == arr.length) {
            return;
        }
        
        // Print current subarray from start to end
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Recursive cases:
        // 1. Move end pointer forward with same start
        printSubarrays(arr, start, end + 1);
        
        // 2. When end reaches array length, reset end to start and increment start
        if (end == arr.length - 1) {
            printSubarrays(arr, start + 1, start + 1);
        }
    }
}