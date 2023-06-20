class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int first = i, second = i + 1, third = nums.length - 1;
            while(second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if(sum == 0) {
                    list.add(new ArrayList<>(Arrays.asList(nums[first],nums[second], nums[third])));
                    second++;
                    while(nums[second] == nums[second - 1] && second < third) {
                        second++;
                    }
                }else if(sum > 0) {
                    third--;
                }else {
                    second++;
                }
            }
        }
        return list;
    }
}

/*
Idea: 
Sort the array first to reduce time complexity O(n^3) to O(n^2). Because by sorting we can fix one element and apply two pointer method.
To remove duplicate check previous element is not equal current element.
To get multiple combination after getting one result move left pointer by 1 and to check duplication traverse left pointer until we don't reach different element.
*/
