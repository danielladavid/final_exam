public class Customer
{
	protected String name;
	protected double amount;

public Customer(String name,double amount){
	this.name= name;
	this.amount= amount;
}
public String getName(){
	return name;
	}
	public void setName(){
		this.name=name;
	}
	public double calculateBill(){
		return amount;
	}
}

