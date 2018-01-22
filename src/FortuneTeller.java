import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String quitMessage = "Nobody likes a quitter...";

		String request = "Enter your first name: ";
		String firstName = queryString(input, request, quitMessage);

		request = "Enter your last name: ";
		String lastName = queryString(input, request, quitMessage);

		request = "Enter your age: ";
		int age = queryInt(input, request, quitMessage);

		request = "Enter your birth month (1-12): ";
		int month = queryInt(input, request, quitMessage);

		System.out.println("Enter your favorite ROYGBIV color,");
		System.out.println("or if you don't know what ROYGBIV is,");
		System.out.print("enter \"Help\": ");
		String color;
		boolean helpNeeded = false;
		do {
			color = input.next().trim().toLowerCase();
			helpNeeded = color.equals("help");
			boolean quitNeeded = color.equals("quit");
			if (quitNeeded) {
				System.out.println(quitMessage);
				System.exit(0);
			} else if (helpNeeded) {
				System.out.println("ROYGBIV is the seven colors that make up the rainbow:");
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				System.out.print("Enter your favorite ROYGBIV color: ");
			}
		} while (helpNeeded);

		request = "How many siblings do you have? ";
		int siblings = queryInt(input, request, quitMessage);

		input.close();

		int yearsToRetirement;
		if (age % 2 == 0) {
			yearsToRetirement = 62 - (age % 62);
		} else {
			yearsToRetirement = 66 - (age % 66);
		}

		String location;
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

		String car;
		if (color.equals("red")) {
			car = "Apollo Arrow";
		} else if (color.equals("orange")) {
			car = "Lexus LFA";
		} else if (color.equals("yellow")) {
			car = "AC Cobra";
		} else if (color.equals("green")) {
			car = "BMW i8";
		} else if (color.equals("blue")) {
			car = "Jeep Wrangler";
		} else if (color.equals("indigo")) {
			car = "MINI Cooper";
		} else if (color.equals("violet")) {
			car = "Toyota Prius";
		} else {
			car = "2002 Renault Avantime";
		}

		int base;
		if (month >= 1 && month <= 4) {
			base = 1000000;
		} else if (month >= 5 && month <= 8) {
			base = 5000000;
		} else if (month >= 9 && month <= 12) {
			base = 500000;
		} else {
			base = 0;
		}

		double balance = base + 2 * base / 10 * (Math.random() - 0.5);
		String formattedBalance = String.format("$%,.2f", balance);

		String message = upperFirstLetter(firstName) + " " + lastName + " will retire in " + yearsToRetirement
				+ " years with " + formattedBalance + " in the bank, a vacation home in " + location
				+ ", and travel in a " + car + ".";
		System.out.println(message);

	}

	private static int queryInt(Scanner input, String request, String quitMessage) {
		System.out.print(request);
		String answerAsString = input.next().trim();
		int answer = -1;
		if (answerAsString.equalsIgnoreCase("quit")) {
			System.out.println(quitMessage);
			System.exit(0);
		} else {
			answer = Integer.parseInt(answerAsString);
		}
		return answer;
	}

	private static String queryString(Scanner input, String request, String quitMessage) {
		String answer;
		System.out.print(request);
		answer = input.nextLine().trim();
		answer = upperFirstLetter(answer);
		if (answer.equalsIgnoreCase("quit")) {
			System.out.println(quitMessage);
			System.exit(0);
		}
		return answer;
	}

	private static String upperFirstLetter(String str) {
		for (int i = 0; i < str.length(); i++) {
			String letter = str.substring(i, i + 1);
			if (letter.equalsIgnoreCase(" ") && str.length() - 1 != i) {
				String firstHalf = str.substring(0, i);
				String secondHalf = str.substring(i + 2);
				String nextLetter = str.substring(i + 1, i + 2).toUpperCase();
				str = firstHalf + " " + nextLetter + secondHalf;
			} else if (i == 0) {
				String remainder = str.substring(i + 1);
				str = letter.toUpperCase() + remainder;
			}
		}
		return str;
	}
}
