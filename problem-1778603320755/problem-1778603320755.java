// Last updated: 5/12/2026, 11:28:40 PM
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
12    public ListNode swapPairs(ListNode head) {
13        if (head == null || head.next == null) return head;
14        
15        ListNode first = head;
16        ListNode second = head.next;
17
18        ListNode tmp = second.next;
19        second.next = first;
20        first.next = swapPairs(tmp);
21
22        return second;
23    }
24}