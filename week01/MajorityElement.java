class Solution {
    public int majorityElement(int[] nums) {
        int majorElement = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                majorElement = nums[i];
                count++;
            }else if(majorElement != nums[i]) {
                count--;
            }else {
                count++;
            }
        }
        return majorElement;
    }
}

/*
Idea: 
Boyer-Moore algo
Iterate through the array. if we found match increase the vote, if not match decrease the vote. if vote is 0 that means choose a new candidate.
 */
