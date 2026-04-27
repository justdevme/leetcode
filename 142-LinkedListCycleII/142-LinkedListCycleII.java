// Last updated: 4/28/2026, 12:26:16 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null || head.next == null) return null;
15
16        ListNode slow = head;
17        ListNode fast = head;
18
19        //check xem co cycle ko
20        while(fast != null && fast.next != null) {
21            slow = slow.next;
22            fast = fast.next.next;
23
24            if (slow == fast) {
25                ListNode p1 = head;
26                ListNode p2 = slow;
27
28                while (p1 != p2) {
29                    p1 = p1.next;
30                    p2 = p2.next;
31                }
32
33                return p1;
34            }
35        }
36        return null;
37    }
38}