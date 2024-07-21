package basicprograms;
class Super_ABC
{
	String name="Garima";
	
	void getData()
	{
		System.out.println("I am inside the parent class");
	}
	
}

public class Super_Keyword extends Super_ABC{
	String name="Java by MKT";
	
	void getData()
	{
		super.getData();
		System.out.println("I am inside the child class");
		System.out.println(super.name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Keyword s1=new Super_Keyword();
		System.out.println(s1.name);
		s1.getData();
		

	}

}
