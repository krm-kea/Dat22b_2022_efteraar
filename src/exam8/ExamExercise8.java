package exam8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamExercise8
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Vi starter på Spørgsmål 8 ");

        File file = new File("data2.txt");
        Scanner scan = new Scanner(file);
        //Scanner scan = new Scanner(System.in);

        boolean notFinished = true;
        int age = -99;
        while (notFinished)
        {
            System.out.print("Hvor gammel er du? ");
            if (scan.hasNextInt())
            {
                age = scan.nextInt();
                notFinished = false;
            }
            else if (scan.hasNext())
            {
                scan.next();
                System.out.println();
                System.out.print("Det duer kun med tal. ");
            }
        }
        System.out.println("Din alder er: " + age);

    }

}