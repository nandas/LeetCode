package week1;


public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a function to delete a node (except the tail) in a singly linked list,
		 *  given only access to that node.

          Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
           the linked list should become 1 -> 2 -> 4 after calling your function.
		 */
		DeleteNode dn=new DeleteNode();
		ListNode one=new ListNode(1);
		ListNode two=new ListNode(2);
		ListNode three=new ListNode(3);
		ListNode four=new ListNode(4);
		one.next=two;two.next=three;three.next=four;
		dn.Print(one);
		dn.deleteNode(three);
		dn.Print(one);
		

	}
	
    public void deleteNode(ListNode node) {
        node.data=node.next.data;
        node.next=node.next.next;
    }
    
    void Print(ListNode head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}

}
