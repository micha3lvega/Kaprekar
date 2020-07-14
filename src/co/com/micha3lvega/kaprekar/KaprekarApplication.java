package co.com.micha3lvega.kaprekar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class KaprekarApplication {

	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) throws Exception {

		int counter = 0;

		for (int i = 1000; i < 9999; i++) {

			String number = Integer.toString(i);

			int result = Integer.MAX_VALUE;
			int steps = 0;
			int maxNumber = orderDesc(number);
			int minNumber = orderAsc(number);

			if (maxNumber != minNumber) {

				while ((result != 6174 && result != 0) && steps++ < 9) {
					result = maxNumber - minNumber;
					maxNumber = orderDesc(Integer.toString(result));
					minNumber = orderAsc(Integer.toString(result));
				}

				print(steps);

			} else {
				print(0);
			}

			// Agregar salto a la cuadricula
			if (counter == 52) {
				System.out.println();
				counter = 0;
			} else {
				counter++;
			}

		}

	}

	private static int orderAsc(String number) {

		List<Character> numbers = generateArrayLetters(number);

		Collections.sort(numbers);
		return createNumber(numbers);

	}

	private static List<Character> generateArrayLetters(String number) {
		List<Character> numbers = new ArrayList<>();

		for (int i = 0; i < number.length(); i++) {
			numbers.add(number.charAt(i));
		}
		return numbers;
	}

	private static int orderDesc(String number) {

		List<Character> numbers = generateArrayLetters(number);

		Collections.sort(numbers, Collections.reverseOrder());
		return createNumber(numbers);

	}

	private static int createNumber(List<Character> numbers) {

		StringBuilder builder = new StringBuilder();

		for (char c : numbers) {
			builder.append(c);
		}

		return Integer.parseInt(builder.toString());
	}

	private static void print(int number) {

		switch (number) {
		case 0:
			System.out.print(" ");
			break;
		case 1:
			System.out.print(ANSI_BLACK_BACKGROUND + ANSI_WHITE + " " + ANSI_RESET);
			break;
		case 2:
			System.out.print(ANSI_CYAN_BACKGROUND + " " + ANSI_RESET);
			break;
		case 3:
			System.out.print(ANSI_PURPLE_BACKGROUND + " " + ANSI_RESET);
			break;
		case 4:
			System.out.print(ANSI_YELLOW_BACKGROUND + " " + ANSI_RESET);
			break;
		case 5:
			System.out.print(ANSI_BLUE_BACKGROUND + " " + ANSI_RESET);
			break;
		case 6:
			System.out.print(ANSI_GREEN_BACKGROUND + " " + ANSI_RESET);
			break;
		case 7:
			System.out.print(ANSI_RED_BACKGROUND + " " + ANSI_RESET);
			break;
		default:
			break;
		}

	}

	public static String generateRandomNumber() {

		Random r = new Random();
		int number = r.nextInt(9999);
		if (number > 1000) {
			return Integer.toString(number);
		} else if (number < 1000 && number > 100) {
			return "0" + Integer.toString(number);
		} else {
			return "00" + Integer.toString(number);
		}

	}

}
