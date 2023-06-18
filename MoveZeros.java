class Solution {
    public void moveZeroes(int[] nums) {
        int countOfZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                countOfZero += 1;
            }else if (countOfZero > 0){
                nums[i - countOfZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}

/* Questions: 
1. duplicate elements
2. size
3. negative elements
*/

/* Idea: 
Solved with snowball technique. Count all zero, when encounter with non zero shift element position.
*/
