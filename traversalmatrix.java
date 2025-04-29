import java.util.Scanner;
public class traversalmatrix {
    public static void main(String[]args)
    {
       
     Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int [][]arr = new int[size][size];
       /*  int [][]arr2=new int[size][size];*/
        int [][]sum = new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
       /*  for(int i=0;i<size;i++)
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
        }*/
       /*  for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==j)
                {
                System.out.print(arr[i][j]+" ");
                }
            }*/

           /* for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    if(i+j==size-1)
                    {
                    System.out.print(arr[i][j]+" ");
                    }
                }
    }
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(i==0)
            {
                System.out.print(arr[i][j]+" ");
            }
            if(i>0 && j==size-1)
            {
                System.out.print(arr[i][j]+" ");
            }
        
        }
    }
        for(int i=2;i<size;i++)
        {
            for(int j=size-1;j>=0;j--)
            {
                if(j<size-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
         
        for(int i=size-1;i>=0;i--)
        {
            for(int j=size-1;j>=0;j--)
            {
                if()
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }*/
        /*for(int i=0;i<size;i++)
        {
                if(i%2==0)
                {
                    for(int j=0;j<size;j++)
                    {
                        System.out.print(arr[i][j]);
                    }
                   
                }
                else{
                    for(int j=size-1;j>=0;j--)
                    {
                        System.out.print(arr[i][j]);   
                    }
                }
            
        }*/

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i>0 && i<size-1 && j>0 && j<size-1)
                {
                    System.out.print(arr[i][j]+" ");
                }

            }
        }

           // System.out.println();

        }
    }
    
   

