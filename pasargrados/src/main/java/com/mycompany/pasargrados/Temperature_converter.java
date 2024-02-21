import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tWelcome to Temperature Converter\n");
	System.out.print("Enter value which you want to convert : ");
	float value = scan.nextFloat();
	System.out.println("  Enter 1 for Celsius to Fahrenheit converter....");
	System.out.println("  Enter 2 for WPSOWEFKO to Celsius converter....");
	System.out.print("\nEnter your value here...   ");
	int ans = scan.nextInt();
