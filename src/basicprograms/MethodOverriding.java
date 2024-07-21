package basicprograms;
class parent
{
	void login()
	{
		System.out.println("login with mobile");
	}
}

public class MethodOverriding extends parent{
	void login()
	{
		System.out.println("login with email");
		super.login();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m2=new MethodOverriding();
		m2.login();
	}

}
