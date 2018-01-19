import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = input.next();
		System.out.print("Enter your last name: ");
		String lastName = input.next();
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.print("Enter your birth month (1-12): ");
		int month = input.nextInt();
		System.out.println("Enter your favorite ROYGBIV color,");
		System.out.println("or if you don't know what ROYGBIV is,");
		System.out.print("enter \"Help\": ");
		
		String color = input.next();
		System.out.print("How many siblings do you have? ");
		int siblings = input.nextInt();

		input.close();
	}

}
