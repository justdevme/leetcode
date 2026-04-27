// Last updated: 4/27/2026, 11:11:25 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prev = dummy;
16        ListNode curr = head;
17
18        while (curr != null) {
19            // TH1: curr.val == cur.next.val -> duplicate
20            if(curr.next != null && curr.val == curr.next.val){
21                while(curr.next != null && curr.val == curr.next.val) {
22                    curr = curr.next;
23                } 
24                prev.next = curr.next;
25                curr = curr.next;
26            } else {
27                // TH2: ko duplicate -> giữ curr, tiến prev
28                prev = curr;
29                curr = curr.next;
30            }
31            
32        }
33        return dummy.next;
34    }
35}