public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}

/*
Idea: 
1. Floyd's cycle detection algorithm.
2. Take two pointer, move one pointer by one and second pointer by two.
Time Complexity: O(n)
Space Complexity: O(1)
*/
