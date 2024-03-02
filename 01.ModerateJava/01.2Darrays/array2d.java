import java.util.*;
public class array2d
{
	public static void main(String[] args)
	{
		//syntax to declare a 2d array is :
		//datatype[][] arr_name=new datatype[row*][col]
		/*
		2D arrays in Java, also called jagged arrays, can include rows with different lengths. A separate 1D array is considered for each row.

		You can assign different row sizes during initialization to initialize a jagged array.

	When accessing or traversing a jagged array, you must account for varying row sizes using techniques such as nested loops or conditional checks to ensure you don’t go out of bounds for any row.

	How to Create 2D Arrays in Java?
	We will look at how to create 2 dimensional with the help of an example. Before that, let us look; we have two index values for a 2d array. One is for a row, and another is for a column.

	Row Size: Rows are the elements in an array that can be stored horizontally. For example, if the Row Size equals 4, the Array will be created with 4 rows.
	Column Size: Columns are the elements in an array that can be stored vertically. For example, if the Column Size equals 2, an array can have 2 Columns.
	Example:

	public class TwoDArray{
	public static void main(String[] args) {
	int[][] twoDimentional = {{12,27},{6,7},{24,3},{30,50}};
	for(int i = 0 ; i < 4 ; i++){
	for(int j = 0 ; j < 2; j++){
	System.out.print(twoDimentional[i][j] + " ");
	}
	System.out.println();
	}
	}
	}
			*/
		int[][] arr=new int[3][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("{");
		for(int i=0;i<3;i++)
		{
			System.out.print("{");
			for(int j=0;j<2;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}

			System.out.println("}");
		}
		System.out.println("}");
	}
}