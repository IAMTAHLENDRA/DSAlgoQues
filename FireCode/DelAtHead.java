public ListNode deleteAtHead(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;

        return head;


}