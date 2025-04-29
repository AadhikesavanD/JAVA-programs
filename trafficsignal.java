import java.util.*;

public class trafficsignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String light = sc.next();
        
        if(light.equals("green"))
        {
            System.out.println("is there are not");
            String ped =sc.next();
            if(ped.equals("yes"))
            {
                System.out.println("drive slow");
            }
            else{
                System.out.println("drive fast");
            }
        }
        else if(light.equals("yellow"))
        {
            System.out.println("prepare to stop");
        }
        else{
            System.out.println("Stop");
        }
    }
}
