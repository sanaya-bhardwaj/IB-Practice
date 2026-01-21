public class Solution {
    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null)
            return A;

        // Step 1: Split the list into two halves
        ListNode mid = getMid(A);
        ListNode right = mid.next;
        mid.next = null;

        // Step 2: Sort both halves
        ListNode left = sortList(A);
        ListNode rightSorted = sortList(right);

        // Step 3: Merge sorted halves
        return merge(left, rightSorted);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
