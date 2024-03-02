public class Conditional
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		if((num1<=10) && (num2<=10))
		{
			System.out.println("Both are less than 10 or equal to 10");
		}
		else if((num1<=10) || (num2<=10))
		{
			System.out.println("One of them is less than or equal to 10");
		}
		else
		{
			System.out.println("Both are greater then 10");
		}
	}
}