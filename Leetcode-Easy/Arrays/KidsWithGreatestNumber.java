class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //this will create a list of booleans to store the answer.
        //this will create a variable to store the maximum number of candies.
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            //for each loop
            if (candy > max) {
                max = candy;
            }
        }
        //this will iterate through the array and check if the number of candies plus the extra candies is greater than or equal to the maximum number of candies.
        for (int candy : candies) {
            ans.add((candy + extraCandies) >= max);
        }
        //this will return the answer after all the booleans have been added to it.
        return ans;
    }
}