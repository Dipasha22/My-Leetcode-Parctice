class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  // Sort greed factors
        Arrays.sort(s);  // Sort cookie sizes
        
        int i = 0;  // child pointer
        int j = 0;  // cookie pointer
        int count = 0;
        
        while (i < g.length && j < s.length) {
            
            if (s[j] >= g[i]) {
                count++;   // child is content
                i++;
                j++;
            } else {
                j++;  // try bigger cookie
            }
        }
        
        return count; 
    }
}