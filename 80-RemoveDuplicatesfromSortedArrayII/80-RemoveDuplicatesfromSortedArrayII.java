// Last updated: 4/19/2026, 12:19:37 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        ListNode curr = head;
14        if (head == null || head.next == null) return head;
15      
16        int length = 1;
17        while (curr.next != null) {
18            curr = curr.next;
19            length++;
20        }
21        ListNode tail = curr;
22        k = k % length;
23        if (k == 0) return head;
24        
25        tail.next = head;
26        ListNode prev = head;
27        for(int i = 0; i < length - k - 1; i++) {
28            prev = prev.next;
29            
30        }
31        ListNode newHead = prev.next;
32     
33        prev.next = null;
34      
35        return newHead;
36    }
37}