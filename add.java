/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class add {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode record = result;
        ListNode pre = null;
        int up = 0;
        int formerUp = 0;
        while (l1 != null && l2 != null) {
            if (l1.val + l2.val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            result.val = (l1.val + l2.val + formerUp) % 10;
            result.next = new ListNode();
            pre = result;
            result = result.next;
            formerUp = up;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            if (l1.val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            pre = result;
            result.val = (l1.val + formerUp) % 10;
            result.next = new ListNode();
            result = result.next;
            formerUp = up;
            l1 = l1.next;
        }
        while (l2 != null) {
            if (l2.val + formerUp >= 10) {
                up = 1;
            } else {
                up = 0;
            }
            pre = result;
            result.val = (l2.val + formerUp) % 10;
            result.next = new ListNode();
            result = result.next;
            formerUp = up;
            l2 = l2.next;
        }

        if (formerUp == 1) {
            result.val = 1;
            result.next = null;
        } else {
            pre.next = null;
        }

        return record;
    }

    public static void main(String args[]) {
        add t = new add();
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(7);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        l1.next = l2;// l3.next = l4;l4.next = l5;
        // l2.next = l3;//l5.next = l6;l6.next = l7;
        ListNode p1 = new ListNode(9);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(4);
        ListNode p4 = new ListNode(9);
        p1.next = p2;// p3.next = p4;
        // p2.next = p3;
        ListNode r = t.addTwoNumbers(l1, p1);
        ListNode a = r;
        while (a != null) {
            System.out.print(a.val + "  ");
            a = a.next;
        }
    }
}