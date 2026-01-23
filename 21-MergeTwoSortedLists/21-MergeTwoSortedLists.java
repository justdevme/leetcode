// Last updated: 1/23/2026, 5:31:22 PM
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
12    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode tail = dummy;
15
16        while (l1 != null && l2 != null) {
17            if(l1.val <= l2.val) {
18                tail.next = l1; // nối node của l1 vào kết quả
19                l1 = l1.next; // tiến l1
20            } else {
21                tail.next = l2;
22                l2 = l2.next;
23            }
24            tail = tail.next;
25        }
26        // 1 trong 2 list còn dư thì nối luôn
27        tail.next = (l1 != null) ? l1 : l2;
28
29        return dummy.next;
30    }
31}