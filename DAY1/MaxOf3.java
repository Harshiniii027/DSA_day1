package DAY1;

import java.util.Scanner;

public class MaxOf3 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + "is greater");
            }
            else{
                System.out.println(c +" is greater");
            }
        }
        else{
            if(b>c)
            {
                System.out.println(b+"is greater");
            }
            else{
                System.out.println(c + "is greater");
            }
        }
        scan.close();
    }
}
