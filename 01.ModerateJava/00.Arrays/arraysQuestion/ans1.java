import java.util.*;
public class ans1
{
	public static void iputArray(int num,String[] arr_name)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			arr_name[i]=sc.next();
		}
	}
	public static void printArray(int num,String[] arr_name)
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(arr_name[i]);
		}		

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] name=new String[size];
		iputArray(size,name);
		printArray(size,name);
	}
}