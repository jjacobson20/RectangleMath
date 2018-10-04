/**
 * 
 * @author jeremy
 *
 */
import java.util.Scanner;

public class RectangleMath
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the width: ");
		
		double width = in.nextDouble();
		in.nextLine();
		
		System.out.print("Enter the height: ");
		
		double height = in.nextDouble();
		in.nextLine();
		
		System.out.printf("Area: %.2f\n", (width * height));
		System.out.printf("Perimeter: %.2f", (width * 2 + height * 2));

	}
	
}
