import java.util.Scanner;

public class maxminmatrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
                arr[i]=sc.nextInt();
            
        }
       
       /*  for(int i=0;i<size;i++)
        {
           
             if(arr[i]>max)
                {
                    max=i;
                }
                 if(arr[i]<min)
                {
                    min=i;
                }
            
        }
        System.out.print(max+" ");
        System.out.print(min+" ");*/
        int max=0 ;
         int secondMax = 0; 
         int min = arr[0];
        for (int i = 0; i < size; i++) 
        {
            if (arr[i] > max)
             {
            secondMax = max;
            max = arr[i];
            } 
            else if (arr[i] > secondMax && arr[i] != max) 
            {
            secondMax = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondMax);

    }
    
}
