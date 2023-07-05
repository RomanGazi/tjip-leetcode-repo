class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        while(index >= 0 && nums[index] >= nums[index + 1]){
            index--;
        }
        if(index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int length = nums.length - 1;
        while(nums[length] <= nums[index]) {
            length--;
        }
        swap(nums, length, index);
        reverse(nums, index + 1, nums.length - 1);
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

/*
Idea: 
1. First find the element which is breaking the ascending sequence from last.
2. Replace the element which is greater than index's element.
3. Then reverse the elements between next of index's element to last element.
*/
