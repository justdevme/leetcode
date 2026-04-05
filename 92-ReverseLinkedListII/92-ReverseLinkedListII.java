// Last updated: 4/5/2026, 11:17:34 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (head == null || left == right) {
14            return head;
15        }
16
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19        ListNode prev = dummy;
20
21        // đi đến trước left
22        for (int i = 1; i < left; i++) {
23            prev = prev.next;
24        }
25
26        // curr là node đầu của đoạn cần reverse
27        ListNode curr = prev.next;
28
29        for (int i = 0; i < right - left; i++) {
30            ListNode nextNode = curr.next;      // node sẽ được nhấc ra
31            curr.next = nextNode.next;          // bỏ nextNode khỏi vị trí cũ
32            nextNode.next = prev.next;          // chèn nextNode sau prev
33            prev.next = nextNode;               // cập nhật đầu đoạn reversed
34        }
35
36        return dummy.next;
37    }
38}