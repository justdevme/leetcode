// Last updated: 4/10/2026, 1:08:36 PM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode mid = findMiddle(head);
14        ListNode secondHead = reverseList(mid);
15
16        ListNode ptr1 = head;
17        ListNode ptr2 = secondHead;
18        boolean res = true;
19
20        while (ptr2 != null) {
21            if (ptr1.val != ptr2.val) {
22                res = false;
23                break;
24            }
25            ptr1 = ptr1.next;
26            ptr2 = ptr2.next;
27        }
28
29        return res;
30    }
31
32    public static ListNode reverseList(ListNode head) {
33        ListNode prevNode = null;
34        ListNode currNode = head;
35        while (currNode != null) {
36            ListNode nextNode = currNode.next;
37            currNode.next = prevNode;
38            prevNode = currNode;
39            currNode = nextNode;
40        }
41        return prevNode;
42    }
43
44    public static ListNode findMiddle(ListNode head) {
45        ListNode slow = head;
46        ListNode fast = head;
47        while (fast != null && fast.next != null) {
48            slow = slow.next;
49            fast = fast.next.next;
50        }
51        return slow;
52    }
53}