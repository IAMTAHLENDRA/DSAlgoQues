public ListNode findMiddleNode(ListNode head) {
if(head == null) return null;
if(head.next == null) return head;


      ListNode current = head;
int length = 0;
      ListNode middle = head;


while(current.next != null){
          length++;
          if(length%2 ==0){
              middle = middle.next;
          }
          current = current.next;
      }

      if(length%2 == 1){
          middle = middle ;
      }


return middle;

}