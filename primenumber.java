//prime number
//prime number=a number that is only divisible by 1 and itself
//ex=2,3,5,7,11,13,17,19
public class primenumber {
    public static void main(String[] args) {
        int num = 7; 
        // 1. MISTAKE FIX: Initialize count to 1 to account for the factor of 1
        int count = 1; 
        
        if (num <= 1) { 
            // Handle non-prime numbers <= 1 before the loop
        } else {
            // 2. MISTAKE FIX: Change the loop to check for factors from 2 up to num - 1
            // (The factor 'num' itself is counted by initializing 'count' to 1)
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            // Add 1 more to count for the factor 'num' itself
            count++;
        }
        
        // Final Check: A prime number will have exactly 2 factors (1 and itself).
        if (count == 2) {
            // This is the correct block for prime numbers
            System.out.println(num + " is a prime number");
        } else {
            // 3. MISTAKE FIX: This must print the NOT prime message
            System.out.println(num + " is NOT a prime number");
        }
    }
}