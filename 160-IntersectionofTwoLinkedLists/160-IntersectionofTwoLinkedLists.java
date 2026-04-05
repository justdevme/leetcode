// Last updated: 4/5/2026, 11:25:54 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode a = headA;
15        ListNode b = headB;
16
17        while (a != b) {
18            a = (a == null) ? headB : a.next;
19            b = (b == null) ? headA : b.next;
20        }
21
22        return a; 
23    }
24}