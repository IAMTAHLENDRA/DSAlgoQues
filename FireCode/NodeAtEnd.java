public ListNode insertAtTail(ListNode head, int data) {
ListNode newnode = new ListNode(data);

if(head == null) {
    return newnode;
} else {
    ListNode curr = head;
    while(curr.next !=null) {
        curr = curr.next;
    }

    curr.next = newnode;

}

return head;

}