package practise.set;

	 class Grandparents
	{
		   void disp()		   
	       {
		      System.out.println("parent class");

		   }
	}	

	class Parent extends Grandparents 
		{
		   void disp()
		   {
		      System.out.println();
		   }
		}  
	
	 class Inheritance extends Parent { 
		public static void main(String[] args) {
		      Inheritance i=new Inheritance();
		       i.disp();
		    }
}

