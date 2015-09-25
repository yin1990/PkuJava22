public class Solution {
    public String reverseWords(String s) {
/*        // runtime 280ms 60%
        // use regex can solve the problem
        // \s+ match at least one space
        String[] words = s.split("\\s+");
        StringBuffer str = new StringBuffer("");
        for (int i = words.length - 1; i >= 0; i--) {
        	if (!words[i].equals("")) {
	        	if (i == words.length - 1) {
	        		str.append(words[i]);
	        	} else {
	        		str.append(" " + words[i]);
	        	}
        	}
        }
        return str.toString();
    }*/
    
        // runtime 248ms 86%
        // Firstly, reverse every words in the string
        // int length = s.length;
        if (s.equals("") || s.trim().equals(""))
            return "";
        StringBuffer str = new StringBuffer(s);
        StringBuffer result = new StringBuffer("");
        int low = 0, high = 0;
        // for (int i = 0; i < str.length(); i++) {
        while (low != str.length()) {
            high = low;
            while (high != str.length() && str.charAt(high) != ' ')
                high++;
            // reverse(str, low, high);
            if (low < high)
            	result.append(reverse(str, low, high - 1));
            low = high;
            while (low != str.length() && str.charAt(low) == ' ')
                low++;
        }
        
        // Reverse the whole string
        reverse(result, 0, result.length() - 1);
        return result.substring(1).toString();
    }
    
    public String reverse(StringBuffer str, int low, int high) {
        // for (int i = start; i < (end - start - 1) / 2)
    	int i = low, j = high;
        while (low < high) {
            char temp = str.charAt(low);
            str.setCharAt(low, str.charAt(high));
            str.setCharAt(high, temp);
            low++;
            high--;
        }
        
        return str.substring(i, j + 1).toString() + " ";
    }
}