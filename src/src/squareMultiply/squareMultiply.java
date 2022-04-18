package squareMultiply;

public class squareMultiply {
    public int modExpoCalculator(int base, int exponent, int modulo) {

        // Implement method here
        int result = 1; // We start with 1 because we are multiplying by 1 initially and then multiplying by base later on in the loop below (base^0 = 1) 
        //  takes 1 
        int baseCopy = base; // We need to keep a copy of the base because we will be changing it in the loop below 
        //  takes 1
        while (exponent > 0) { // We will keep looping until the exponent is 0 
            // 1 for comparison  
            if (exponent % 2 == 1) { // We will check if the exponent is odd or even and then multiply the result by the base if the exponent is odd or multiply the result by the base and then the base if the exponent is even
               // 1 for mod , 1 for comparison
                result = (result * baseCopy) % modulo; // We wil multiply the result by the base and then modulo the result by the modulo
                // 1 assignment, 1 multiplication, 1 modulo
                // l multiply the result by the base and then modulo it by the modulo
            } // If the exponent is even, we will not multiply by the base
            
            baseCopy = (baseCopy * baseCopy) % modulo; // We will square the base and then modulo it by the modulo to get the next base
            // 1 assignment, 1 multiplication, 1 modulo 
            exponent = exponent / 2; // We will divide the exponent by 2 because we are only interested in odd exponents
            // 1 assignment, 1 division 
        }


        return result; // Return the result 
        // 1 for return 
        
        // We loop log (n) times in while loop because of n/2 in each iteration 
        // T(n) = 2 + 11log(n) + 1 -- > ignoring constant --> T(n) = O(log(n))
        
        
    }

    // 
}
