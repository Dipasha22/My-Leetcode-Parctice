class Solution {
    public String intToRoman(int num) {
        String result = "";
        
        // Thousands
        while (num >= 1000) {
            result = result + "M";
            num -= 1000;
        }
        
        // Hundreds  
        if (num >= 900) {
            result = result + "CM";
            num -= 900;
        }
        while (num >= 500) {
            result = result + "D";
            num -= 500;
        }
        if (num >= 400) {
            result = result + "CD";
            num -= 400;
        }
        while (num >= 100) {
            result = result + "C";
            num -= 100;
        }
        
        // Tens
        if (num >= 90) {
            result = result + "XC";
            num -= 90;
        }
        while (num >= 50) {
            result = result + "L";
            num -= 50;
        }
        if (num >= 40) {
            result = result + "XL";
            num -= 40;
        }
        while (num >= 10) {
            result = result + "X";
            num -= 10;
        }
        
        // Ones
        if (num >= 9) {
            result = result + "IX";
            num -= 9;
        }
        while (num >= 5) {
            result = result + "V";
            num -= 5;
        }
        if (num >= 4) {
            result = result + "IV";
            num -= 4;
        }
        while (num >= 1) {
            result = result + "I";
            num -= 1;
        }
        
        return result;
    }
}
