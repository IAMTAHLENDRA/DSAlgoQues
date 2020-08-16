public ListNode insertAtHead(ListNode head, int data) {

    ListNode newnode = new ListNode(data);
    if(head == null) {
        return newnode;
    }

    newnode.next=head;
    return newnode;

}