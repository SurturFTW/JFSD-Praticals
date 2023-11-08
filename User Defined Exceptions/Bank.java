package SpringBootException2.SpringBootException2;

public class Bank {
	private int amount;
	final int min = 500;
	String name;

	public Bank(int amt, String name) {
		this.amount = amt;
		this.name = name;
	}

	public void Withdraw(int amt) throws PayoutOfBoundsException {
		if (amount - min < amt)
			throw new PayoutOfBoundsException("Withdrawal not allowed. Minimum balance limit is 500.");
		else
			amount -= amt;
	}

	public void deposit(int amt) {
		this.amount += amt;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}
}