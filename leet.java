import java.net.Socket;
import java.util.Scanner;

public class leet {
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
            for(int j=0;j<size;j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
