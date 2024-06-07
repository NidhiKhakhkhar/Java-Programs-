class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class ReverseLinkedList{

    public static void printLinkedList(ListNode head){
        while(head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }

        System.out.println("null");
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }
        return prev;
    }

    public static void main(String[] args){
        ReverseLinkedList rll = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Input : ");
        printLinkedList(head);

        ListNode reversed = rll.reverseList(head);

        System.out.print("Output : ");
        printLinkedList(reversed);


    }
}