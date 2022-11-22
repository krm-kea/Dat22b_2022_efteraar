package exam4;

public class Person
{
    private String name;
    private int age;
    private int cpr;

    public Person(String n, int a, int c)
    {
        name = n;
        age = a;
        cpr = c;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getCpr()
    {
        return cpr;
    }
}
