import java.util.*;
public class ans1  
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] number = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				number[i][j]=sc.nextInt();
			}
		}
		int num2find=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(number[i][j]==num2find)
				{
					System.out.print("Num found at"+i+","+j);
				}
			}
		}
	}
}