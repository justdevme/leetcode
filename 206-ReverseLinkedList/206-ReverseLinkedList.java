// Last updated: 1/23/2026, 4:43:36 PM
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
12    public ListNode reverseList(ListNode head) {
13        ListNode prev = null;
14        ListNode cur = head;
15
16        while (cur != null) {
17            ListNode nextTemp = cur.next;
18            cur.next = prev; // đảo ngược chiều
19            prev = cur;
20            cur = nextTemp;
21        }
22        return prev;
23    }
24}