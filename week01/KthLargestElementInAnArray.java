class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(queue.peek() < nums[i]) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.peek();
    }
}

/*
Idea:
It can be solved using priority queue. By default prioty queue in java is min heap. so first insert k elements from array. Then iterate from k index
to last index and compare if top element is less than current array element then remove the top element and insert the current element.
 */
