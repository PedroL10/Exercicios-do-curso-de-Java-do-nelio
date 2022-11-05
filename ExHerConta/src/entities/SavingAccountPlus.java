package entities;

public class SavingAccountPlus extends SavingAccount{

	
	//Se o metodo withdraw da classe SavingAccount for final não será possivel sobrescreve-lo
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}
}
