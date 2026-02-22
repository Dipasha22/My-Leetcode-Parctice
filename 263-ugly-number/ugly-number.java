class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;  // Only positive integers
        
        // Remove all factors of 2
        while (n % 2 == 0) {
            n /= 2;
        }
        
        // Remove all factors of 3
        while (n % 3 == 0) {
            n /= 3;
        }
        
        // Remove all factors of 5
        while (n % 5 == 0) {
            n /= 5;
        }
        
        return n == 1;
    }
}
