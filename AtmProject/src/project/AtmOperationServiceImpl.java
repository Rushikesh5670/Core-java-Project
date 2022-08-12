package project;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationServiceImpl implements AtmOperationService {
	Atm atm = new Atm();
	Map<Double, String> miniStatement = new HashMap<>();
	static int count = 0;

	@Override
	public double viewBalance() {
		return atm.getBalance();

	}

	@Override
	public String withdrawAmount(double withdrawAmount) {
		if (count < 4) {
			try {
				if (withdrawAmount % 100 != 0) {
					return "\nPlease enter multiple of 100!!";
				} else if (withdrawAmount < 0) {
					throw new NegetiveAmountException("\nAmount can not be negetive");
				} else if (withdrawAmount > 20000) {
					return "\nAt one time you can only withdraw 20000 RS";
				} else if (withdrawAmount <= atm.getBalance()) {
					miniStatement.put(withdrawAmount, " Amount Withdrawn");
					double balanceAmount = atm.getBalance() - withdrawAmount;
					atm.setBalance(balanceAmount);
					count++;
					return "\nCollect the Cash " + withdrawAmount + "\nCurrent balance is: " + viewBalance();

				} else {
					return "\nInsufficient Balance !!";
				}
			} catch (NegetiveAmountException e) {
				return e.getMessage();

			}
		} else {
			return "\nYour daily withdrawal limit exceeded";
		}

	}

	@Override
	public String depositAmount(double depositAmount) {
		try {
			if (depositAmount < 0) {
				throw new NegetiveAmountException("Amount can not be negetive");
			}
			miniStatement.put(depositAmount, " Amount Deposited\n");
			double balanceAmount = atm.getBalance() + depositAmount;
			atm.setBalance(balanceAmount);
			return "\n"+depositAmount + " Deposited Successfully !!" + "\nCurrent balance is: " + viewBalance();
		} catch (NegetiveAmountException e) {
			return e.getMessage();
		}

	}

	@Override
	public Map<Double, String> viewMiniStatement() {
		return miniStatement;

	}
}
