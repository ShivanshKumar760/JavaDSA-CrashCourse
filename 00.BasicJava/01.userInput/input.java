import java.util.*;
public class input
{

	public static void main(String[] args)
	{
		//to take input we need to initate a new Scanner class object with System.in as parameter
		//to take input 
		//C++ int x;
		//cin>>x;
		//in java we have something called as Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a = sc.nextInt();//is for interger
		System.out.println(a);
		String b=sc.next();//is for string
		System.out.println(b);
		double c=sc.nextDouble();//is for double datatype 
		System.out.println(c);
		float d=sc.nextFloat();//is for float data type 
		System.out.println(d);
		boolean e=sc.nextBoolean();//is for true and false 
		System.out.println(e);
		
	}
}