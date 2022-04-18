package findMax;

public class max {
    public int findMax(int input1, int input2) {

        if (input1 > input2) { // we can use if statement or ternary operator here to return the max value of two numbers
            return input1; // if input1 is greater than input2, return input1
        } else { // else return input2 if input1 is less than input2 else return input1
            return input2; // return input2 if input1 is less than input2 else return input1
        }
    }
}