public ListNode deleteAtTail(ListNode head) {
        if(head == null)
        return null;

        if(head.next == null)
        return null;

        ListNode secondLast = head;
        while(secondLast.next.next != null)
        secondLast = secondLast.next;

        secondLast.next = null;

        return head;


        }