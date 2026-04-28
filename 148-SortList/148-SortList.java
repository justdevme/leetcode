// Last updated: 4/28/2026, 3:02:54 PM
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
12    public ListNode sortList(ListNode head) {
13        // base case: list rỗng hoặc chỉ có 1 node 
14        if (head == null || head.next == null) {
15            return head;
16        }
17
18        // tìm mid
19        ListNode slow = head;
20        ListNode fast = head;
21        ListNode prev = null;
22
23        while (fast != null && fast.next != null) {
24            prev = slow;
25            slow = slow.next;
26            fast = fast.next.next;
27        }
28        prev.next = null;
29        
30        ListNode left = sortList(head);
31        ListNode right = sortList(slow);
32
33        return merge(left, right);
34    }
35
36    private ListNode merge(ListNode l1, ListNode l2) {
37        ListNode dummy = new ListNode(0);
38        ListNode cur = dummy;
39
40        while (l1 != null && l2 != null) {
41            if (l1.val <= l2.val) {
42                cur.next = l1;
43                l1 = l1.next;
44            } else {
45                cur.next = l2;
46                l2 = l2.next;
47            }
48            cur = cur.next;
49        }
50
51        if (l1 != null) {
52            cur.next = l1;
53        }
54
55        if (l2 != null) {
56            cur.next = l2;
57        }
58
59        return dummy.next;
60    }
61}