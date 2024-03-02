public class hollowRactangle
{
	/*
	
	****
	*  *
	****

	*/
	public static void main(String[] args) {
		int row=3;
		int col=4;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(j==1 || j==col || i==1||i==row)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}