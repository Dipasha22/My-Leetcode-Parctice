class Solution {
    public String[] findWords(String[] words) {
      String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            
            String lower = word.toLowerCase();
            String row = "";
            
            // Decide which row first letter belongs to
            if (row1.contains("" + lower.charAt(0))) {
                row = row1;
            } else if (row2.contains("" + lower.charAt(0))) {
                row = row2;
            } else {
                row = row3;
            }
            
            boolean valid = true;
            
            // Check remaining letters
            for (int i = 1; i < lower.length(); i++) {
                if (!row.contains("" + lower.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);  
    }
}
