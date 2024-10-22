package DAY1;
import java.util.Scanner;
public class EvenOddChekker {
    public static void main(String [] args)
    {
        int number;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        if ( number % 2 == 0)
        {
            System.out.println("Its an Even Number");
        }
        else{
            System.out.println("Its an Odd Number");
        }
        
    }
    
}
