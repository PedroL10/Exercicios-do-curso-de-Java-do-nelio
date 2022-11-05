package entities;

//a palavra final evita que a classe seja herdada ou que o metodo seja sobreposto
public final class BusinessAccount extends Account{

	
	private Double loanlimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);;
		balance -= 2.0;
	}
	
	
	public void loan (Double amount) {
		if(amount<=loanlimit) {
		balance += amount - 10.0;
		}
	}
}
