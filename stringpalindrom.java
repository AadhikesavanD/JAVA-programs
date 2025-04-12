import java.util.Scanner;

public class stringpalindrom {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String str = sc.next();
       int n = str.length();
       int i=0,j=0,flag=0;
       for(i=0,j=str.length()-1;i<n/2,j>n/2;i++,j--)
       {
        flag = 0;
        if(str.charAt(i)==str.charAt(j))
        {
            flag = 1;;
        }
       }
       if(flag==1){
        System.out.println(str);
       }
 } 
    
}