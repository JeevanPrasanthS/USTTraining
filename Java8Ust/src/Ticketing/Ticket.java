package Ticketing;

public class Ticket {

	private int tId;
	private String name;
	private String source;
	private String destination;
	private int kms;
	private double amount;
	
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Ticket() {
		super();
	}
	public Ticket(int tId, String name, String source, String destination, int kms) {
		super();
		this.tId = tId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.kms = kms;
//		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Ticket [tId=" + tId + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", kms=" + kms  + "]";
	}
	
	
	
	
}
