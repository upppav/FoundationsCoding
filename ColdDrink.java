package foundationCoding;

public class ColdDrink implements Products {

	private String name;
	private double price;
	

	public ColdDrink(String name, double price) {
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
		return "ColdDrink{" +"name= "+ name + "price="+ price +'}';
	}

	


}
