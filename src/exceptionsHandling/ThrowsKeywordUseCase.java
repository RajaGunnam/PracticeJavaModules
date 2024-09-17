package exceptionsHandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
}

public class ThrowsKeywordUseCase {
	double available_Balance = 50000.00;

	public void bankTransactions() throws InsufficientFundsException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the amount = ");

		double withdraw_Amount = sc.nextDouble();

		if (withdraw_Amount <= available_Balance) {
			System.out.println("Please collect your cash = " + withdraw_Amount);
			available_Balance = available_Balance - withdraw_Amount;
			System.out.println("Available Balance = "+available_Balance);
		} else {
			throw new InsufficientFundsException("Insufficient funds. You only have " + available_Balance);

		}
	}

	public static void main(String args[]) {
		ThrowsKeywordUseCase tk = new ThrowsKeywordUseCase();
		try {
			tk.bankTransactions();
		} catch (Exception e) {
			System.out.println("Error - " + e.getMessage());
		}
	}
}
