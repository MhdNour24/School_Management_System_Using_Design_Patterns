package models;

public abstract class Person {
	
	protected long id;
	protected String name;
	protected String fatherName;
	protected long phoneNo;
	protected String address;
	protected long pincode;
    protected long amount;  
	public Person() {
		super();
	}
	public Person(long id, String name, String fatherName, long phoneNo, String address, long pincode) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	public abstract long getAmount();
	public abstract void setAmount(long amount);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
}

