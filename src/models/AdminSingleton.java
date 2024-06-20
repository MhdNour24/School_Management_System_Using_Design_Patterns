package models;

public enum AdminSingleton {
	INSTANCE;
	
	private Admin admin = new Admin();
	
	public Admin getInstance() {
		return admin;
	}

}
class Admin extends Person {

	protected static int  i = 100;
	
	public Admin() {
		super();
	}

	@Override
	public long getAmount() {
		return this.amount;
	}

	@Override
	public void setAmount(long availableFund) {
		this.amount = availableFund;
		
	}

}