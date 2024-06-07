class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class LinkedListCycle{
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;

        ListNode slow = head , fast = head.next;
        while( slow != fast){
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);

        LinkedListCycle llc = new LinkedListCycle();
        System.out.print("Output : " + llc.hasCycle(head));

    }
}