package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtmMainClass {
	public static void main(String[] args) {
		AtmOperationService atmOperationService = new AtmOperationServiceImpl();
		int atmnumber = 12345;
		int atmpin = 1234;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("\nEnter Atm Number : ");
		int atmNumber = in.nextInt();
		System.out.print("Enter Pin: ");
		int pin = in.nextInt();
		if ((atmnumber == atmNumber) && (atmpin == pin)) {
			while (true) {
				System.out.println(
						"\n\n1.Withdraw Amount\n2.Deposit Amount\n3.View Available Balance\n4.View Ministatement\n5.Exit");
				System.out.print("\nEnter Choice : ");
				int ch = in.nextInt();

				switch (ch) {
				case 1: {
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = in.nextDouble();
					System.out.println(atmOperationService.withdrawAmount(withdrawAmount));
					break;
				}
				case 2: {
					System.out.print("\nEnter Amount to Deposit: ");
					double depositAmount = in.nextDouble();
					System.out.println(atmOperationService.depositAmount(depositAmount));
					break;
				}
				case 3: {

					System.out.println("\nAvailable Balance is : " + atmOperationService.viewBalance());
					break;
				}
				case 4: {

					Map<Double, String> miniStatementMap = atmOperationService.viewMiniStatement();
					if (miniStatementMap.size() == 0) {
						System.out.println("No transactions till now");
					} else {
						for (Map.Entry<Double, String> m : miniStatementMap.entrySet()) {
							System.out.println(m.getKey() + "" + m.getValue());
						}
					}
					break;
				}
				case 5: {
					System.out.println("\nPlease collect your ATM Card \nThank you for using ATM Machine!!");
					System.exit(0);
					break;
				}
				default: {
					System.out.println("\nPlease enter correct choice");
				}
				}
			}
		} else {
			System.out.println("\nIncorrect Atm Number or pin");
			System.exit(0);
		}

	}
}