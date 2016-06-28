package week1;

public class RemoveElementsinLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveElementsinLL rem=new RemoveElementsinLL();
		ListNode one=new ListNode(4);
		ListNode two=new ListNode(3);
		ListNode three=new ListNode(2);
		ListNode four=new ListNode(1);
		ListNode five=new ListNode(1);
		one.next=two;two.next=three;three.next=four;four.next=five;
		rem.Print(rem.removeElements(one, 1));

	}
	
	void Print(ListNode head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}
	
	public ListNode removeElements(ListNode head, int val) {
		 ListNode helper = new ListNode(0);
		    helper.next = head;
		    ListNode p = helper;
		 
		    while(p.next != null){
		        if(p.next.data == val){
		            ListNode next = p.next;
		            p.next = next.next; 
		        }else{
		            p = p.next;
		        }
		    }
		 
		    return helper.next;
    }

}
