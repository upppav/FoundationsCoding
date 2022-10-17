package foundationCoding;
import java.util.List;

public class Customer {

	private CartDetails cartDetails;
	private Payment payment;
	private Billing bill;
	
	public CartDetails getCartDetails() {
		return cartDetails;
	}
	public Payment getPayment() {
		return payment;
	}
	public Billing getBill() {
		return bill;
	}
	public void setCartDetails(CartDetails cartDetails) {
		this.cartDetails = cartDetails;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public void setBill(Billing bill) {
		this.bill = bill;
	}
	
}
