package exam3;

public class ExamExercise3
{
    static int nummer = 7;
    public static void main(String[] args)
    {
        System.out.println("Nu starter exercise 3");
        boolean test = isTrue(nummer);
        System.out.println("Tallet " + nummer + " er mindre end 10: " + test);
    }

    public static boolean isTrue(int value)
    {
        if (value < 10)
        {
            return true;
        }
        return false;
    }

}