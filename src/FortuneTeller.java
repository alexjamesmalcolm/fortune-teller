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
		if (color.trim().toLowerCase().equals("help")) {
			System.out.println("ROYGBIV is the seven colors that make up the rainbow:");
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
			System.out.print("Enter your favorite ROYGBIV color: ");
			color = input.next();
		}
		System.out.print("How many siblings do you have? ");
		int siblings = input.nextInt();

		input.close();
		int yearsToRetirement;
		int bankBalance;
		String location;
		String transportation;
		
		if (age % 2 == 0) {
		} else {}
	}

}
