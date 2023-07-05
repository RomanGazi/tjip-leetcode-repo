class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1, nums2Index = n - 1, currentIndex = m + n - 1;
        while(nums1Index >= 0 && nums2Index >= 0) {
            if(nums1[nums1Index] < nums2[nums2Index]) {
                nums1[currentIndex--] = nums2[nums2Index--];
            }else {
                nums1[currentIndex--] = nums1[nums1Index--];
            }
        }
        while(nums2Index >= 0) {
            nums1[currentIndex--] = nums2[nums2Index--];
        }
    }
}

/* 
Idea: 
Iterate array from last to first and compare elements.
keep track of current index.
*/
