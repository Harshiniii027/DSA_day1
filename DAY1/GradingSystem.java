package DAY1;
import java.util.*;
public class GradingSystem {
    public static void main(String [] args)
    {
        int score;
        Scanner scan = new Scanner(System.in);
        score= scan.nextInt();

        if(score>=90)
        {
            System.out.println("GRADE A");
        }
        else if(score>=80 && score<=89)//score>=80
        {
            System.out.println("GRADE B");
        }
        else if ( score >= 70 && score <= 79 )//score>=70
        {
            System.out.println("GRADE C");
        }
        else if ( score >= 60 && score <= 69 )//score>=60
        {
            System.out.println("GRADE D");
        }
        else{
            System.out.println("GRADE F");
        }
        scan.close();
    }
    
}
