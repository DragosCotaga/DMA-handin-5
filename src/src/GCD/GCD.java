package GCD;

public class GCD
{
    // Euclidean algorithm is the most simple to implement

    public int findGCD1(int a, int b)
    {

        // Implement your method here that uses for loop
        for (; b % a != 0; )
        {
            a = b % a;
        }
        return a;
    }

    public int findGCD2(int a, int b)
    {
        // Implement your method here that uses a while loop
        while (b % a != 0)
        {
            a = b % a;
        }
        return a;
    }

    public int findGCD3(int a, int b)
    {
        // Implement your method here that uses for loop
        if (a % b != 0)
        {
            return findGCD3(b % a, a);
        }
        return b;
    }
}