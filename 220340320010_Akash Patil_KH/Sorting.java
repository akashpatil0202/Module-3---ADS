class Sorting
{
  public static void inSort (int a1[])
  {
	  int a =a1.length;
      
	  for(int i=1;i<a;i++)
	  {
		 int key =a1[i];
		 
		 int j = i - 1;
		  
		 
		 while(j>=0 && a1[j] > key)
		 {
		   a1[j + 1] = a1[j];
		   j = j - 1;
		 }
		 a1[j + 1] = key;
	  } 
  
  }
  
  
   public static void displayArr(int a1[])
   {
	   int a =a1.length;
	   
	    System.out.print("\nSorted Array is : ");
	    for(int i=0;i<a;i++)
		{
		 System.out.print(a1[i] + " ");
		}
		 System.out.println();

   }



   public static void main(String[] args)
   {
       int a1[] = {2,4,6,8,3};
	   Sorting s = new Sorting();
	   
	   s.inSort(a1);
	   
	   displayArr(a1);
	   

   }


}