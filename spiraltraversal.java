import java.util.*;
public class spiraltraversal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of the matrix");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The spiral numbers are");
        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a[0].length-1;
        while(top<=bottom && left<=right)
        {
            //left to right
            for(int i=left;i<=right;i++)
            {
                System.out.print(a[top][i]+" ");
            }
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(a[i][right]+" ");
            }
            right--;

            if(top<=bottom)
            {
                //right to left
                for(int i=right;i>=left;i--)
                {
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right)
            {
                //bottom to top
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
        }
    }
}