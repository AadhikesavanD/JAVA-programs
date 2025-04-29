import java.util.*;

public class ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); 
        String weekday = sc.nextLine();

        if (age <= 13) {
            if (weekday.equals("yes")) {
                System.out.println("price is 100");
            } else {
                System.out.println("price 120");
            }
        } else if (age < 64) {
            if (weekday.equals("yes")) {
                System.out.println("price is 150");
            } else {
                System.out.println("price is 180");
            }
        } else {
            if (weekday.equals("yes")) {
                System.out.println("price is 130");
            }
             else {
                System.out.println("price 150");
            }
        }

        
    }
}
