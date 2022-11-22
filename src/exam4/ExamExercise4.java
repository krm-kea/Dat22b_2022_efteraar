package exam4;

import java.util.Scanner;

public class ExamExercise4
{
    public static void main(String[] args)
    {
        System.out.print("Hvor mange tal vil du printe? ");
        Scanner scan = new Scanner(System.in);
        int stop = scan.nextInt();

        for(int i=1; i <=stop; i++)
        {
            for (int b=0; b<5-i; b++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<(i*2-1); j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        boolean notFinished = true;
        while(notFinished)
        {
            System.out.print("Her er en burger.");
            System.out.print("   Er du tilfreds? (ja/nej) ");
            String svar = scan.next();
            if (svar.equals("ja"))
            {
                notFinished = false;
            }
        }

    }
}
