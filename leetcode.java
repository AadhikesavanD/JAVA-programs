import java.util.*;
public class leetcode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        int temp =0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            temp=temp*10+arr[i];
        }
        System.out.print(temp+1);
               
       
        

    }
}
