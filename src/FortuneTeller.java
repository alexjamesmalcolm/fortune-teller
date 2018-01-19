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

		int yearsToRetirement = 0;
		int bankBalance = 0;
		String location = "";
		String transportation = "";

		if (age % 2 == 0) {
			yearsToRetirement = 62 - (age % 62);
		} else {
			yearsToRetirement = 66 - (age % 66);
		}

		if (siblings == 0) {
			location = "Budva, Montenegro";
		} else if (siblings == 1) {
			location = "Venice, CA";
		} else if (siblings == 2) {
			location = "Santa Marta, Colombia";
		} else if (siblings == 3) {
			location = "Leuven, Belgium";
		} else if (siblings > 3) {
			location = "Munnar, India";
		} else {
			location = "Pyongyang, North Korea";
		}

		switch (color.toLowerCase()) {
		case "red":
			transportation = "Apollo Arrow";
			break;
		case "orange":
			transportation = "Lexus LFA";
			break;
		case "yellow":
			transportation = "AC Cobra";
			break;
		case "green":
			transportation = "BMW i8";
			break;
		case "blue":
			transportation = "Jeep Wrangler";
			break;
		case "indigo":
			transportation = "MINI Cooper";
			break;
		case "violet":
			transportation = "Toyota Prius";
			break;
		default:
			System.out.println("You misspelled a color, please try again.");
			System.exit(0);
		}

		System.out.println(yearsToRetirement);
		System.out.println(bankBalance);
		System.out.println(location);
		System.out.println(transportation);
	}
}
