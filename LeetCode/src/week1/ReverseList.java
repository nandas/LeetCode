package week1;


public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseList rev=new ReverseList();
		ListNode one=new ListNode(4);
		ListNode two=new ListNode(3);
		ListNode three=new ListNode(2);
		ListNode four=new ListNode(1);
		one.next=two;two.next=three;three.next=four;
		rev.Print(rev.Reverse(one));

	}
	
	
	ListNode Reverse(ListNode head) {
		if(head == null ) return null;
		if(head.next==null) return head;
		ListNode temp=head.next;        
		head.next=null;             
		ListNode temp1= Reverse(temp);
		temp.next=head;
		return temp1;


	}
	
	void Print(ListNode head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}

}
