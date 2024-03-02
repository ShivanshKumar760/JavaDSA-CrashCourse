//5*4*3*2*1

public class Fact
{
	public static void main(String args[])
	{
		int num=6;
		int result=1;
		for(int i=0;i<num;i++)//1<=4//2<=3//
		{
			result=result*(num-i);
		}
		System.out.println(result);
	}
}