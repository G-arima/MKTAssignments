package basicprograms;

public class NonStaticMethod {
	void add()
	{
		int a=25;
		int b=35;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		int a=25;
		int b=35;
		int sub=a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		NonStaticMethod n1=new NonStaticMethod();
		n1.add();
		n1.subtract();

	}

}
