import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String request = "Enter your first name: ";
		String firstName = queryString(input, request);

		request = "Enter your last name: ";
		String lastName = queryString(input, request);
		
		request = "Enter your age: ";
		int age = queryInt(input, request);
		
		request = "Enter your birth month (1-12): ";
		int month = queryInt(input, request);

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
				String quitMessage = "Nobody likes a quitter...";
				System.out.println(quitMessage);
				System.exit(0);
			} else if (helpNeeded) {
				System.out.println("ROYGBIV is the seven colors that make up the rainbow:");
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				System.out.print("Enter your favorite ROYGBIV color: ");
			}
		} while (helpNeeded);
		
		request = "How many siblings do you have? ";
		int siblings = queryInt(input, request);

		input.close();

		int yearsToRetirement = 0;
		double balance = 0;
		String location = "";
		String car = "";

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
			car = "Apollo Arrow";
			break;
		case "orange":
			car = "Lexus LFA";
			break;
		case "yellow":
			car = "AC Cobra";
			break;
		case "green":
			car = "BMW i8";
			break;
		case "blue":
			car = "Jeep Wrangler";
			break;
		case "indigo":
			car = "MINI Cooper";
			break;
		case "violet":
			car = "Toyota Prius";
			break;
		default:
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

		balance = base + 2 * base / 10 * (Math.random() - 0.5);
		String formattedBalance = String.format("$%,.2f", balance);

		String message = firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with "
				+ formattedBalance + " in the bank, a vacation home in " + location + ", and travel in a " + car + ".";
		System.out.println(message);

	}

	private static int queryInt(Scanner input, String request) {
		System.out.print(request);
		String answerAsString = input.next().trim();
		int answer = -1;
		if (answerAsString.equalsIgnoreCase("quit")) {
			String quitMessage = "Nobody likes a quitter...";
			System.out.println(quitMessage);
			System.exit(0);
		} else {
			answer = Integer.parseInt(answerAsString);
		}
		return answer;
	}

	private static String queryString(Scanner input, String request) {
		String answer;
		System.out.print(request);
		answer = input.nextLine().trim();
		answer = upperFirstLetter(answer);
		if (answer.equalsIgnoreCase("quit")) {
			String quitMessage = "Nobody likes a quitter...";
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
			}
		}
		return str;
	}
}
