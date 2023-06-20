class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxConsecutive = 0, currentValue = 0;

        for(int num: nums){
            set.add(num);
        }
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] - 1)) {
                currentValue = nums[i] + 1;
                while(set.contains(currentValue)) {
                    currentValue++;
                }
                maxConsecutive = Math.max(maxConsecutive, currentValue - nums[i]);
            }
        }
        return maxConsecutive;
    }
}

/* 
Idea: 
To remove duplicate input added in set. 
Iterate through array and find the lowest element of sequence present in the set, if found then iterate through again whole set to find out consecutive sequence.
*/
