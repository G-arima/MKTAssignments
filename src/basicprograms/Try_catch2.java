package basicprograms;

public class Try_catch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		try {
		arr[4]=50;
		//System.out.println("Array Program");
		}catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Handled the Exception");
		}

	}

}
