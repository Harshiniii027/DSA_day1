package DAY1;
import java.util.*;
public class PosNegZero {
    public static void main(String [] srgs)
    {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num>0)
        {
            System.out.println("POSITIVE");
        }
        else if(num<0)
        {
            System.out.println("NEGATIVE");
        }
        else
        {
            System.out.println("ZERO");
        }
        scan.close();
    }
}
