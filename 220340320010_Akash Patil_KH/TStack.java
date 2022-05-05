class TStack
{
	
	int size;
	int array[];
	int tos1;
    int tos2;


    TStack(int s)
    {
	  array = new int[s];
      size = s;
      tos1 = -1;
      tos2 =  size; 
		
	}	


    void push1(int a)
	{
		if(tos1<tos2-1)
		{
		   tos1++;
           array[tos1] = a;		   
		}
        else
        {
		 System.out.println("Stack Overflow");
		 System.exit(0);
	
		}			

	}
	
	
	
	  void push2(int a)
	{
		if(tos1<tos2-1)
		{
		   tos2--;
           array[tos2] = a;		   
		}
        else
        {
		 System.out.println("Stack Overflow");
		 System.exit(0);
	
		}			

	}



  void pop1()
	{
		if(tos1>=0)
		{
		   int a = array[tos1];
		   tos1--;
           return a;	   
		}
        else
        {
		 System.out.println("Stack Underflow");
		 System.exit(0);
	
		}			

	}


  void pop2()
	{
		if(tos2<size)
		{
		   int a = array[tos2];
		   tos2++;
           return a;	   
		}
        else
        {
		 System.out.println("Stack Underflow");
		 System.exit(0);
	
		}			

	}



   public static void main()
   {
     
	 TStack t = new TStack();
	 
	     t.push1(5);
         t.push2(10);
         t.push2(15);
         t.push1(11);
  
		 System.out.println("Element popped : "+t.pop());
         
		 t.push2(7);
         t.push2(40);
		 
		 System.out.println("Element popped : "+t.pop());
   }


}