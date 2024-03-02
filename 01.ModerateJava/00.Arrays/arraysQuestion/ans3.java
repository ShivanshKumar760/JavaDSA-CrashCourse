import java.util.*;
public class ans2 {


	public static void iputArray(int num,int[] arr_name)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			arr_name[i]=sc.nextInt();
		}
	}
	public static void printArray(int num,int[] arr_name)
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(arr_name[i]);
		}		

	}

	public static boolean isAscending(int num,int[] arr_name)
	{
		boolean flag=true;
		for(int i=0;i<num-1;i++)
		{
			if(arr_name[i]>arr_name[i+1])
			{
				flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		iputArray(size,arr);
		System.out.println(isAscending(size,arr));
	}


}