class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // Points to next position for non-val element
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];  // Copy non-val element to front
                i++;               // Move boundary forward
            }
            // Skip val elements (j++ handles this)
        }
        
        return i;  // i is count of non-val elements
    }
}
