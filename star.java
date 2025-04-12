import java.util.*;
public class star 
{
 public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the amount of Star:");
    int n = scan.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int k=1;k<=n;k++)
    {
       
        for(int l=n-1;l>=k;l--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }


    
 }   
}
