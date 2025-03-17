class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        //start with empty string
        int idx1 = 0, idx2 = 0;
        //this will iterate through both strings until one of them is empty.
        while (idx1 < word1.length() && idx2 < word2.length()){
            ans += word1.charAt(idx1) + "";
            ans += word2.charAt(idx2) + "";
            idx1++;
            idx2++;
        }
        //this will add the rest of the string to the answer if one of them is empty.
        //this will check if the first string is empty and add the rest of the second string to the answer.
        if (idx1 < word1.length()){
            ans += word1.substring(idx1, word1.length());
        }
        //this will check if the second string is empty and add the rest of the first string to the answer.
        if (idx2 < word2.length()){
            ans += word2.substring(idx2, word2.length());
        }
        //this will return the answer after all the strings have been added to it.
        return ans;
    }
}