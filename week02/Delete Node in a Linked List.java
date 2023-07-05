class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/* 
Idea: 
If we copy the next node to current node then the current node's previous value will be removed. Then update the link accordingly.
Time Complexity: O(1)
Space Complexity: O(1)
*/
