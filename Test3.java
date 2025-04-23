class BankAccount{
	double bal=0;
	public void deposit(double a){
		bal+=a;
		System.out.println("Amount Credited: "+bal);
	}
	public void withdraw(double a){
		bal-=a;
		System.out.println("Amount Debited: "+a);
	}
}

class SavingsAccount extends BankAccount{
	
	public void withdraw(double a){
		if(bal<100){
			System.out.println("Low Balance! Balance: "+bal);
		}else{
			super.withdraw(a);
		}
	}
}

class Test3{
	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount();
		
		s.deposit(1000);
		
		s.withdraw(901);
		
		s.withdraw(100);

		
	}
}
