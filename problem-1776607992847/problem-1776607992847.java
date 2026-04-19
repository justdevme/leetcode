// Last updated: 4/19/2026, 9:13:12 PM
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
12    public ListNode partition(ListNode head, int x) {
13        
14        ListNode startLess = new ListNode(0);
15        ListNode startGreater = new ListNode(0);
16        
17        ListNode small = startLess;
18        ListNode large = startGreater;
19
20        while(head != null) {
21            if (head.val < x) {
22                small.next = head;
23                small = small.next;
24            } else if (head.val >= x){
25                large.next = head;
26                large = large.next;
27            }
28            head = head.next;
29        }
30        // combine
31        small.next = startGreater.next;
32        large.next = null;
33        return startLess.next;
34    }
35}