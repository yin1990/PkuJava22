public class Solution {
    public String addBinary(String a, String b) {
        //int max = a.length() > b.length() ? a.length() : b.length();
        //int[] flag = new int[max + 1];
        //int[] result = new int[max + 1];
        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;
        StringBuffer result = new StringBuffer();
        while (i >= 0 && j >= 0) {
            int sum = (a.charAt(i--) - '0') + (b.charAt(j--) - '0') + flag;
            result.append(sum % 2);
            flag = sum / 2;
            //i--;
            //j--;
        }
        
        if (i >= 0) {
            while (i >= 0) {
                int sum = a.charAt(i--) - '0' + flag;
                result.append(sum % 2);
                flag = sum / 2;
            }
        }
        if (j >= 0) {
            while (j >= 0) {
                int sum = b.charAt(j--) - '0' + flag;
                result.append(sum % 2);
                flag = sum / 2;
            }
        }
        
        if (flag == 1)
            result.append('1');
        return result.reverse().toString();
        
        
        /*if (a.length() > b.length()) {
            while (i >= 0) {
                int sum = a.charAt(i--) - '0' + flag[k];
                result[k] = sum % 2;
                flag[--k] = sum / 2;
            }
        }
        if (a.length() < b.length()) {
            while (j >= 0) {
                int sum = b.charAt(j--) - '0' + flag[k];
                result[k] = sum % 2;
                flag[--k] = sum / 2;
            }
        }
        
        if (flag[k] == 1)
            result[k] = 1;
        
        String sum = result.toString();
        int start = 0;
        while (sum.charAt(start) != '1')
            start++;
        return sum.substring(start);*/
    }
}