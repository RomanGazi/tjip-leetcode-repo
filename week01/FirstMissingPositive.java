class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]);
            if(temp <= nums.length && temp > 0)  {
                nums[temp - 1] = -Math.abs(nums[temp - 1]);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}

/* 
Idea: 
1. First remove the element which is greater than array size and less than equal 0.
2. Do in place indexing to recognize which elements are present and mark them negative.
3. Iterate through the array and find the result.
*/
