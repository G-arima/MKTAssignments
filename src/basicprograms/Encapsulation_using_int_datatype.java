package basicprograms;

public class Encapsulation_using_int_datatype {
	private int otp=0000;
	
	public void setotp(int otp) {
		this.otp=otp;
	}
	public int getotp() {
		return otp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_using_int_datatype e2=new Encapsulation_using_int_datatype();
		e2.setotp(1234);
		System.out.println(e2.getotp());
	}

}
