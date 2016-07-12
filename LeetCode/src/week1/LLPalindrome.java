package week1;

public class LLPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one=new ListNode(1);
		ListNode two=new ListNode(2);
		ListNode three=new ListNode(3);
		ListNode four=new ListNode(4);
		ListNode five=new ListNode(3);
		ListNode six=new ListNode(2);
		ListNode seven=new ListNode(1);
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		
		LLPalindrome test=new LLPalindrome();
		System.out.println(test.isPalindrome(one));

	}
	
	public boolean isPalindrome(ListNode head) {
		 
	    if(head == null || head.next==null)
	        return true;
	 
	    //find list center
	    ListNode fast = head;
	    ListNode slow = head;
	 
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	 
	    ListNode secondHead = slow.next;
	    slow.next = null;
	 
	    //reverse second part of the list
	    ListNode p1 = secondHead;
	    ListNode p2 = p1.next;
	 
	    while(p1!=null && p2!=null){
	        ListNode temp = p2.next;
	        p2.next = p1;
	        p1 = p2;
	        p2 = temp;
	    }
	 
	    secondHead.next = null;
	 
	    //compare two sublists now
	    ListNode p = (p2==null?p1:p2);
	    ListNode q = head;
	    while(p!=null){
	        if(p.data != q.data)
	            return false;
	 
	        p = p.next;
	        q = q.next;
	 
	    }
	 
	    return true;
	}
	
	 void Print(ListNode head)
		{
		  while(head !=null){
			  System.out.print(head.data+"-");
			  head=head.next;
		  }
		}

}
