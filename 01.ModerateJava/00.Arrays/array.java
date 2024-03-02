import java.util.Scanner;
public class array 
{
	public static void main(String[] args)
	{
		int[] marks=new int[3];
		marks[0]=97;
		marks[1]=98;
		marks[2]=99;

		char[] seq={'a','b','c'};

		String[] sentance={"Hello","World"};

		for(int i=0;i<3;i++)
		{
			System.out.println(marks[i]);
		}

		for(int i=0;i<3;i++)
		{
			System.out.println(seq[i]);
		}

		for(int i=0;i<2;i++)
		{
			System.out.println(sentance[i]);
		}
		Scanner sc=new Scanner(System.in);
		int size;
		size=sc.nextInt();
		int[] number=new int[size];
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(number[i]);
		}
	}
}