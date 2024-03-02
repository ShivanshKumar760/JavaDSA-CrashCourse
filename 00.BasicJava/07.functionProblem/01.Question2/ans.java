public class ans
{
	public static int fact(int num) {
		if(num==0)
		{
			System.out.println("Invalid input!");
			return 0;
		}
		int factorial=1;
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String[] args) {
		System.out.println(fact(0));
		System.out.println(fact(5));
	}
}