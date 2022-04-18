//the input to your program is an array of N positive integers, and your program must output the largest integer in the input. For instance, if the input array contains these ten elements

package findMax2;

import java.util.Arrays;

public class max2 {
    public int findMax2(int[] input) {
        // TODO implement method
        Arrays.sort(input);
        return input[input.length - 1];
    }
}
