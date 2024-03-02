public class triangle 
{
	public static void main(String[] args) {
		int row = 5;
		for(int rowCounter=1;rowCounter<=row;rowCounter++)
		{
			for(int number=1;number<=rowCounter;number++)
			{
				if(number==1)
				{
					for(int numSpace=row-rowCounter;numSpace>=1;numSpace--)
					{
						System.out.print(" ");
					}
				}
				System.out.print(rowCounter+" ");
			}
			System.out.println();
		}
	}
}