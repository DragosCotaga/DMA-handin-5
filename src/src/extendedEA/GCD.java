package extendedEA;

import java.util.Scanner;

// This is a dependent class whose methods are used by
// extendedEA

public class GCD
{

    public static int findGCD(int a, int b)
    {
        // Copy your favorite GCD method from Program 1 here
        int gn;
        {
            if (a > b)
            {
                while (b % a != 0)
                {
                    gn = a;
                    a = b % a;
                    b = gn;

                }
                return a;
            }
            else
            {
                while (a % b != 0)
                {
                    gn = b;
                    b = a % b;
                    a = gn;
                }
            }
            return b;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Give two integers to calculate their gcd: ");
        x = input.nextInt();
        y = input.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is: " + findGCD(x, y));
        input.close();
    }

}