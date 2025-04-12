import java.util.*;
public class leet4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
 /*       for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }*/
        String rev ="";
        for(int i=str.length()-1;i<=0;i++)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }

}