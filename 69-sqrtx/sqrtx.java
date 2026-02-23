class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Avoid overflow
            
            if (mid <= x / mid) {  // mid*mid <= x (avoid overflow)
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;  // right is floor(sqrt(x))
    }
}
