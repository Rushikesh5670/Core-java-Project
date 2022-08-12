package project;

public class UserInformation {
	
	private String name;
	private int atm_number;
	private int atm_pin;
	
	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInformation(String name, int atm_number, int atm_pin) {
		super();
		this.name = name;
		this.atm_number = atm_number;
		this.atm_pin = atm_pin;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAtm_number() {
		return atm_number;
	}

	protected void setAtm_number(int atm_number) {
		this.atm_number = atm_number;
	}

	protected int getAtm_pin() {
		return atm_pin;
	}

	protected void setAtm_pin(int atm_pin) {
		this.atm_pin = atm_pin;
	}

	@Override
	public String toString() {
		return "UserInformation [name=" + name + ", atm_number=" + atm_number + ", atm_pin=" + atm_pin + "]";
	}
	
	
	

}
