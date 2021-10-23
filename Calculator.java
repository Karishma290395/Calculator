package test5;

import java.util.*;// WAP to accept 2 numbers from user & perform arithmetic operation on it (add,subtract,multiply, divide) & show output
//accept direction from user about operation to be perform & show results

class Calculator {

	public static void main(String[] args) {

		Boolean startAgain = true;
		Scanner sc = new Scanner(System.in);
		float firstNumber = 0;
		float secondNumber = 0;
		int choice = 0;
		while (startAgain) {
			System.out.print("Enter first number - ");
			firstNumber = inputFloat(sc, firstNumber);

			System.out.print("Enter second number - ");
			secondNumber = inputFloat(sc, secondNumber);
			System.out.println("Number you entered : a=" + firstNumber + " b=" + secondNumber);

			System.out.println("\nSelect an operation to be performed :\r\n" + "1. Addition\r\n" + "2. Subtraction\r\n"
					+ "3. Multiplication\r\n" + "4. Division");
			choice = inputInt(sc, choice);
			System.out.println("You selected option " + choice);

			switch (choice) {
			case 1:
				System.out.println(
						"Addition of " + firstNumber + " & " + secondNumber + "=" + (firstNumber + secondNumber));
				break;
			case 2:
				System.out.println(
						"Substraction of " + firstNumber + " & " + secondNumber + "=" + (firstNumber - secondNumber));
				break;
			case 3:
				System.out.println(
						"Multiplications of " + firstNumber + " & " + secondNumber + "=" + firstNumber * secondNumber);
				break;
			case 4:
				System.out.println(
						"Division of " + firstNumber + " & " + secondNumber + "=" + (float) firstNumber / secondNumber);
				break;
			default:
				System.out.println("Incorrect selection");
				break;
			}
			System.out.println("Do you want to continue ? - Yes/No");
			String decision = sc.next();
			while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no")) {
				System.out.println("You enterd incorrect input ");
				System.out.println("Do you want to continue ? - Yes/No");
				decision = sc.next();
			}
			if (decision.equalsIgnoreCase("yes")) {
				startAgain = true;
			} else if (decision.equalsIgnoreCase("no")) {
				startAgain = false;
			}


		}
		System.out.println("Thank you for using our application!!!");

	}

	private static float inputFloat(Scanner sc, float number) {
		try {
			String firstNumber1 = sc.next();
			number = Float.parseFloat(firstNumber1);
		} catch (NumberFormatException e) {
			System.out.println("Incorrect Input! Please Enter Valid Number");
			number = inputFloat(sc, number);
		}
		return number;
	}
	private static int inputInt(Scanner sc, int number) {
		try{
			String Choice=sc.next();
			number=Integer.parseInt(Choice);
			} catch(NumberFormatException e) {
				System.out.println("Incorrect Input! Please Enter Valid Number");
				number=inputInt(sc, number);
				
				}
		return number;
		}
	}
