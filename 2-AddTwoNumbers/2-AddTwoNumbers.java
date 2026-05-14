// Last updated: 5/14/2026, 4:14:04 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode cur = dummy;
15
16        int carry = 0;
17        while (l1 != null || l2 != null || carry != 0) {
18            int x = l1 != null ? l1.val : 0;
19            int y = l2 != null ? l2.val : 0;
20
21            int sum = x + y + carry;
22
23            int digit = sum % 10;
24            carry = sum / 10;
25
26            cur.next = new ListNode(digit);
27            cur = cur.next;
28
29            if (l1 != null) {
30                l1 = l1.next;
31            }
32
33            if (l2 != null) {
34                l2 = l2.next;
35            }
36        }
37        return dummy.next;
38    }
39}