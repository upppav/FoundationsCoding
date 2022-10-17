package foundationCoding;

public class Chacolate implements Products{

	private String name;
	private double price;
	

	public Chacolate(String name, double price) {
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
		return "Chacolate{" +"name= "+ name + "price="+ price +'}';
	}


}
