package foundationCoding;

public class Milk implements Products {

	private String name;
	private double price;
	

	public Milk(String name, double price) {
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
		return "milk{" +"name= "+ name + "price="+ price +'}';
	}

	

}
