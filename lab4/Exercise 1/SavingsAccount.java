package lab4Assignments;

	public class SavingsAccount extends Account {
		public SavingsAccount(long accNum, double balance, Person accHolder) {
			super(accNum, balance, accHolder);
			// TODO Auto-generated constructor stub
		}


		final double minimum_balance=500;

		
		@Override
		public void withdraw(double amount) {
			if(balance>=minimum_balance)
				balance=balance-amount;
			else
				System.out.println("Cannot Withdraw from this Account");
		}
	}


