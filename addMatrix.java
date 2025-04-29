import java.util.Scanner;
public class addMatrix {
    public static void main(String[]args)
    {
       
     Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int [][]arr = new int[size][size];
        int [][]arr2=new int[size][size];
        int [][]sum = new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}   

