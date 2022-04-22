package first;

public class conoverloading {
	int age;
	String name;
	
	conoverloading()
	{
		System.out.println("default cons\n");
	}
	
	conoverloading(int a)
	{
		System.out.println(a);
	}
	
	conoverloading(int a,String b)
	{
		
		System.out.println(a+"   "+b);	
		
	}
	
	public static void main(String []args)
	{
		conoverloading c1=new conoverloading();
		conoverloading c2=new conoverloading(120);
		conoverloading c3=new conoverloading(45,"nmgzsdcas");
		
		System.out.println(c1.age);
		
	}
}
