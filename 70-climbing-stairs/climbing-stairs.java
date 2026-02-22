class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int prev2 = 1;  // n=1 ways
        int prev1 = 2;  // n=2 ways
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2; 
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}
