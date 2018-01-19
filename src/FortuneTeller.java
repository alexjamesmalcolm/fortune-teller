import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = input.nextLine().trim();
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, 0).toLowerCase();
		if (firstName.equalsIgnoreCase("quit")) {
			System.exit(0);
		}

		System.out.print("Enter your last name: ");
		String lastName = input.nextLine().trim();
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, 0).toLowerCase();
		if (lastName.equalsIgnoreCase("quit")) {
			System.exit(0);
		}

		System.out.print("Enter your age: ");
		String stringAge = input.next().trim();
		int age = 0;
		if (stringAge.equalsIgnoreCase("quit")) {
			System.exit(0);
		} else {
			age = Integer.parseInt(stringAge);
		}

		System.out.print("Enter your birth month (1-12): ");
		String stringMonth = input.next().trim();
		int month = 0;
		if (stringMonth.equalsIgnoreCase("quit")) {
			System.exit(0);
		} else {
			month = Integer.parseInt(stringMonth);
		}

		System.out.println("Enter your favorite ROYGBIV color,");
		System.out.println("or if you don't know what ROYGBIV is,");
		System.out.print("enter \"Help\": ");
		String color;
		boolean helpNeeded = false;
		do {
			color = input.next().trim();
			helpNeeded = color.equalsIgnoreCase("help");
			boolean quitNeeded = color.equalsIgnoreCase("quit");
			if (quitNeeded) {
				System.exit(0);
			} else if (helpNeeded) {
				System.out.println("ROYGBIV is the seven colors that make up the rainbow:");
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				System.out.print("Enter your favorite ROYGBIV color: ");
			}
		} while (helpNeeded);

		System.out.print("How many siblings do you have? ");
		String stringSiblings = input.next().trim();
		int siblings = -1;
		if (stringSiblings.equalsIgnoreCase("quit")) {
			System.exit(0);
		} else {
			siblings = Integer.parseInt(stringSiblings);
		}

		input.close();

		int yearsToRetirement = 0;
		double bankBalance = 0;
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
			transportation = "2002 Renault Avantime";
		}

		int multiplier;
		if (month >= 1 && month <= 4) {
			multiplier = 1000000;
		} else if (month >= 5 && month <= 8) {
			multiplier = 5000000;
		} else if (month >= 9 && month <= 12) {
			multiplier = 500000;
		} else {
			multiplier = 0;
		}

		bankBalance = multiplier + 2 * multiplier / 10 * (Math.random() - 0.5);
		String formattedBankBalance = String.format("$%,.2f", bankBalance);// + String.format("%, d", bankBalance);

		String message = firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with "
				+ formattedBankBalance + " in the bank, a vacation home in " + location + ", and travel in a "
				+ transportation + ".";
		System.out.println(message);

	}
}
