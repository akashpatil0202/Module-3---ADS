class LinkedListR
{
  static LNode head;
  
 
 static class LNode
  {
    int data;
    LNode next;
    
	
	LNode(int a)
	{
      data = a;
      next = null;	  
	
	}

  }  
  
  
  static LNode reverse(LNode head)
  {
    if(head == null || head.next == null)
     return head;
	 
	 LNode rev = reverse(head.next);
     head.next.next = head;

    head.next = null;
    return rev;	
  
  }
  
  
   public void displayList(LNode h)
   {
     LNode r = h;
	 
	 while(r != null)
	 {
	  
	  System.out.print(r.data + " ");
	  r = r.next;
	 
	 }
   
     System.out.println();
   
   }
  
  public static void main(String[] args)
  {
    
	LinkedListR listL1 = new LinkedListR();
	LinkedListR listL2 = new LinkedListR();
	
	
//------------------------------------------List 1----------------------------------------------------------
	
	listL1.head = new LNode(1);
	
	listL1.head.next = new LNode(5);
	
	listL1.head.next.next = new LNode(1);
	
	listL1.head.next.next.next = new LNode(2);
	
	listL1.head.next.next.next.next = new LNode(3);
	
	listL1.head.next.next.next.next.next = new LNode(4);
	
	listL1.head.next.next.next.next.next.next = new LNode(5);
	
	
	System.out.println("The LinkedList 1 Before Reverse : ");
	listL1.displayList(head);
	head = listL1.reverse(head);
	System.out.println(" ");
	System.out.println("The LinkedList 1 After Reverse : ");
	listL1.displayList(head); 
	
	
//------------------------------------------List 2----------------------------------------------------------	
	
	listL1.head = new LNode(2);
	
	listL1.head.next = new LNode(4);
	
	listL1.head.next.next = new LNode(3);
	
	listL1.head.next.next.next = new LNode(4);
	
	listL1.head.next.next.next.next = new LNode(2);
	
	listL1.head.next.next.next.next.next = new LNode(5);
	
	
	
	System.out.println("\nThe LinkedList 2 Before Reverse : ");
	listL2.displayList(head);
	head = listL2.reverse(head);
	System.out.println(" ");
	System.out.println("The LinkedList 2 After Reverse : ");
	listL2.displayList(head); 
  
  }

}