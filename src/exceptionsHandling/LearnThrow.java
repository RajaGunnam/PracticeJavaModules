package exceptionsHandling;

import java.util.Scanner;

public class LearnThrow {
//	int myAge;
//
//	public void ageTest() {
//
//		System.out.println("Please enter your Age: ");
//
//		Scanner sc = new Scanner(System.in);
//		myAge = sc.nextInt();
//
//		try {
//			if (myAge < 18) {
//				throw new Exception("He is a small Kid, he does not have a voter ID");
//			} else {
//				System.out.println("You are eligible to cast your vote");
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}

	public static void main(String args[]) {
		// LearnThrow lt = new LearnThrow();
		// lt.ageTest();
		BankException be = new BankException(null);
		try {
		be.cashWithdraw();
		}
		catch (BankException e) {
			System.out.println("Error : "+ e.getMessage());
		}

	}
}

// Creating User defined Exceptions
class BankException extends RuntimeException {

	double availableBalance = 46000.00;

	public BankException(String msg) {
		super(msg);
	}

	public void cashWithdraw() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("How much you want to withdraw: ");
            double withdrawalAmount = sc.nextDouble(); 
            if (withdrawalAmount <= availableBalance) {
                System.out.println("Please collect your cash");
                availableBalance = availableBalance - withdrawalAmount;
                double Current_Amount = availableBalance;
                System.out.println("Available Amount "+ Current_Amount);
            } else {
                throw new BankException("You don't have a sufficient amount in your account");
            }
        } finally {
            sc.close(); // Ensure Scanner is closed after use
        }
    }
}