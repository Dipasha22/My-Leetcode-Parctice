class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = getSumOfSquares(slow);      // 1 step
            fast = getSumOfSquares(getSumOfSquares(fast));  // 2 steps
        } while (slow != fast && fast != 1);
        
        return fast == 1;
    }
    
    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
