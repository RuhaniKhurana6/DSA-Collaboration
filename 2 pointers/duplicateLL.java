/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }
    ListNode front = head.next;
    ListNode back = head;
    while (front != null) {
      if (front.val == back.val) {
        back.next = front.next;
        front = back.next;
      } else {
        back = front;
        front = front.next;
      }
    }
    return head;
  }
}