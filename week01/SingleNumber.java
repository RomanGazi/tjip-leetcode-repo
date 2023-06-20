class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}

/*
Idea: 
1. Using hashmap
2. Using xor
xor of two same element is 0. 0 xor of an element is that element.
*/
