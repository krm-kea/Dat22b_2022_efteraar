package exam5;

public class ExamExercise5
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int[] a = {4,8,15,17,88,43,9};
        int[] b = {6, 7, -33, 7};
        int x = 7;
        int y = 9;

        x = y;
        //a = b;

        double result = sum(a);
        System.out.println("middelvaerdi er: " + result);
    }

    public static double sum(int[] arr)
    {
        double dims = 0;
        for(int i=0; i< arr.length; i++)
        {
            dims = dims + arr[i];
        }
        dims = dims / arr.length;
        return dims;
    }
}