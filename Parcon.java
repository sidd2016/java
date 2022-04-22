package first;

 class callparconst
{
	int id;
	String name;
    
	callparconst(int id, String name)
	{
		
		this.id=id; 
		this.name=name;
	}
		
		
}

 public class Parcon {
	 public static void main(String []args)
		{
		  callparconst ob=new callparconst(10,"shivam");
		  System.out.println("ID= "+ob.id+"\n"+"NAME= "+ob.name);
		}
	
}
