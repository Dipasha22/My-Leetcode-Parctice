class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int n = nums.length;
        boolean[] present = new boolean[n];
        
        // Mark numbers that appear
        for (int i = 0; i < n; i++) {
            present[nums[i] - 1] = true;
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Find missing numbers
        for (int i = 0; i < n; i++) {
            if (!present[i]) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}