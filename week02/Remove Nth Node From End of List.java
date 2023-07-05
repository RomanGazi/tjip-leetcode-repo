class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            length++;
        }
        if(length == n) {
            return head.next;
        }
        curr = head;
        while(length - n > 1) {
            curr = curr.next;
            length--;
        }
        curr.next = curr.next.next;
        return head;
    }
}

/*
Idea: 
1. Find the length of Linked List.
2. Iterate through the list to move to the deleted position.
Time Complexity: O(n)
Space Complexity: O(1)
 */
