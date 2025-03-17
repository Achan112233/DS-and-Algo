class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            //if digits are smaller than 9 then add 1 to the first occurence and return digits after
            if (digits[i] < 9){
                digits[i]++;
                //returning first instance of adding 1 if valid.
                return digits;
            }
            //if digits are 9 then set to zero and continue to the next digit of the array//position
            //this will continue until the first digit is reached or a digit smaller than 9 is found.
            digits[i] = 0;
        }
        //in the case that all digits are 9 then we clone the array and add 1 to the first position.
        //this will create a new array of size digits.length + 1 and set the first position to 1.
        int[] ans = new int[digits.length + 1];
        //this will set the first position to 1 and the rest of the array to 0.
        ans[0] = 1;
        //setting first to zero and returning the number after.
        return ans;
    }
}