class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null, current = head;
        while(current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}

/*
Idea:
1. Approaching the idea is two pointer. Point previous node, current node and next node. Then update the values and iterate through the list.
Time Complexity: O(n)
Space Complexity: O(1)
*/
