public class Methods
{
	//Syntax of declaring a method in java is :
	/*
	public static returnType functionName(parameters)
	{
		//code	
	}
	*/

	public static void sayHello()
	{
		System.out.println("Hello");
	}
	public static int addNum(int num1 , int num2)
	{
		return num1+num2;
	}
	public static void main(String[] args)
	{
		sayHello();
		System.out.println(addNum(3,4));
	}
}