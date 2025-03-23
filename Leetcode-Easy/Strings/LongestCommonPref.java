class Solution {
    public String longestCommonPrefix(String[] strs) {
        //U- all strings in the array must share the prefix, saving the substring of the longest prefix
        //M-prefix tree (MAYBE), 
        //P- if size > 0 substring = strs[0]  
        // if size == 1 return substring
        // result = ""
        // for str in strs
            //for i = 0; i < str.length;i++
                //if i < substring.length and str[i] == substring[i]    
                //result =+ (str.charAt(i) + "")
                //else
                //break
            //substring = result
        //return result
        String substring = strs[0];
        String result = "";
        for (String str : strs) {
            result = "";
            for (int i = 0; i < str.length(); i++) {
                if (i < substring.length() && str.charAt(i) == substring.charAt(i)) {
                    result += str.charAt(i) + "";
                } else {
                    break;
                }
            }
            substring = result;
        }
        return result;
    }
}