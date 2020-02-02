package week1.day1;

public class MyMobile 
{
	public static void main(String[] args) 
	{
		Mobile obj=new Mobile();
		boolean productuInfo=obj.isIndiaMade;
		String brand=obj.mobileBrand;
		int modelNo=obj.modelnumber;		
		System.out.println("Is Indian made product :"  +productuInfo);
		System.out.println("Mobile Brand is :" +brand);
		System.out.println("Mobile Model number is :" +modelNo);
		
		obj.takeSnap();
		obj.addNumber(1234567891);
		long num=obj.searchNum("Divya");
		System.out.println("Mobile number is :" +num);
		String st=obj.addNumber("Ashok", 1212121212);
		System.out.println(st);
	}
}
