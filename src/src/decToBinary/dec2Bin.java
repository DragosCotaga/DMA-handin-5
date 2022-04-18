package decToBinary;

import java.util.Scanner;

public class dec2Bin
{
  public static String convertDec2Bin(int n)
  {
    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if (n < 0)
      throw new IllegalArgumentException();

    // TODO implement method
    while (n > 0) // The loop will run log(n) times
    { // We will add the remainder of the division to the output string in reverse order (from least significant to most significant)
      binaryNum = (n % 2) + binaryNum; // We divide the number by 2 and get the remainder (0 or 1) and add it to the output string
      n = n / 2; // We get the remainder of the division by 2 and store it in n for the next iteration of the loop
    }

    return binaryNum; // We return the output

    // No recursion means no base case is needed
    // Because n/2 in each iteration, we loop log(n) times
    // Therefore, the loop will run log(n) times
    // While loops decrement by 2 at each iteration, giving us a very fast O(log(n)) runtime algorithm in comparison to a "normal" loop that increments and decrements by 1 at each iteration.
  }

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(convertDec2Bin(read));
      System.out.println();
    }
  }
}
