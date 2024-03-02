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

	public static int[] minMax(int num,int[] arr_name,int min,int max)
	{
		for(int i=0;i<num;i++)
		{
			if(arr_name[i]<min)
			{
				min=arr_name[i];
			}
			if(arr_name[i]>max)
			{
				max=arr_name[i];
			}
		}
		int result[]={min,max};
		return result;		

	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		iputArray(size,arr);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		printArray(2,minMax(size,arr,min,max));
	}


}