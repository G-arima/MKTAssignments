package basicprograms;

import java.util.Date;

public class Date_class_methods extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
	   System.out.println(d1.getTime()); 
	   Date d2=new Date(d1.getTime());
	   System.out.println(d2);
	   String time=d2.toString();//Object class first method
	   String month=time.substring(4, 7);
	   System.out.println(month);
	   String date=time.substring(8, 10);
		System.out.println(date);
		String year=time.substring(time.length()-4);
		System.out.println(year);
		String dateformat1=date.concat(month).concat(year);
		System.out.println(dateformat1);
		String dateformat2=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(dateformat2);
		String dateformat3=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(dateformat3);
		Date_class_methods d3=new Date_class_methods();
		System.out.println(d3.getClass());//Object class methods

	}

}
