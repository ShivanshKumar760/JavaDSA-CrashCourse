import java.util.*;
public class stringgs {
	public static void main(String[] args)
	{
		//initiating a string via new keyword which creates a string object
		String name = new String("Shivansh");
		System.out.println(name);
		//we can find the length of the string using the .length() method
		System.out.println(name.length());
		//we can also take a string input using the sc.next(); or sc.nextLine()
		Scanner sc=new Scanner(System.in);
		String lastName=sc.nextLine();
		System.out.println(lastName);
		//we can access string character using indexing just the same way we use to access arrays element but here instead of using
		//square braces we use .charAt() method with index as parameter
		System.out.println("The first Character of the string name is:"+name.charAt(0));
	}
}