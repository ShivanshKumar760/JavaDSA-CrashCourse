public class ans  
{
	public static boolean isPrime(int Number)
	{
		boolean flag=true;
		for(int i=2;i<Number;i++)
		{
			if(Number%i==0)
			{
				flag=false;
			}

		}
		return flag;

	}
	public static void main(String[] args) {
		System.out.println(isPrime(5));
	}
}