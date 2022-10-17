package foundationCoding;

public class Snacks implements Products {

	private String name;
	private double price;
	

	public Snacks(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String toString()
	{
		return "snacks{" +"name= "+ name + "price="+ price +'}';
	}

}
