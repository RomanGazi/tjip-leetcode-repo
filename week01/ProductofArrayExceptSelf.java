class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }
        for(int i = 0, tempValue = 1; i < nums.length; i++) {
            result[i] *= tempValue;
            tempValue *= nums[i];
        }

        for(int i = nums.length - 1, tempValue = 1; i >= 0; i--) {
            result[i] *= tempValue;
            tempValue *= nums[i];
        }

        return result;
    }
}

/* 
Idea: 
It can be solved using prefix and suffix multiplication. prefix multiplication means iterate through array and store the multiplication of 0 to i - 1 index. Insert multiplication of result array value and suffix's multiplication to result array. And same way do suffix multiplication. That means n-1 to i - 1.

Using division: 
find production of the array. Then divide by corresponding index value.
*/
