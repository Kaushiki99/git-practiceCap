package lab4Assignments;

	public class CurrentAccount extends Account{

		public CurrentAccount(long accNum, double balance, Person accHolder) {
			super(accNum, balance, accHolder);
			// TODO Auto-generated constructor stub
		}
		double overdraft_limit=90;
		
		@Override
		public void deposit(double amount) {
			if(balance+amount>overdraft_limit) 
				System.out.println("Cannot deposit this big amount");
			else
				balance=balance+amount;
		}
	}
