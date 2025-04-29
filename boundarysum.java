import java.util.Scanner;
public class boundarysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][]arr=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==0 || i==size-1 || j==0|| j==size-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
