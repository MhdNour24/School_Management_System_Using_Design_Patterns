package models;

public class Worker extends Person {
	
	public Worker(int i) {
		this.id = i;
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long salary) {
		this.amount = salary;
	}
}
