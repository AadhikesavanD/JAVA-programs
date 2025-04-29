import java.util.*;
public class multiMatrix {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [][]arr = new int[size][size];
        int [][]arr2=new int[size][size];
        int [][]sum = new int[size][size];
        System.out.println("matrix1");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
               
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix2");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ans");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                sum[i][j]=0;
                for(int k=0;k<size;k++)
                {
                    sum[i][j]+=arr[i][k]*arr2[k][j];
                }
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
