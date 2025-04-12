import java.util.*;
public class leetrev {
    public static int main(String[] args) {
        int rem = 0;
        int x = 0;
        long rev=0;
        while(x!=0)
        {
            rem=(int) (rev*10+rem);
            x=x/10;
        }
        return(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE)?0:(int)rev; 
    }
}
