import java.util.Scanner;

public class betrothnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 2; i <n1 ; i++) {
            if (n1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (int i = 2; i <n2 ; i++) {
            if (n2 % i == 0) {
                sum2 = sum2 + i;
            }
    }
    if(n1 == sum2 && n2 ==sum1)
    {
        System.out.println("it is a betrothed number");
    }
    else{
        System.out.println("not a betroth num");
    }
}
}
