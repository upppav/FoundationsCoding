package foundationCoding;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Billing {
	 private Customer customer;
	    private double totalCost;



	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

	    public double getTotalCost() {
	        setTotalCost();
	        return totalCost;
	    }

	    public void setTotalCost() {
	        double totalCost = 0;
	        List<Products> product = customer.getCartDetails().getProductList();
	        for(Products p : product){
	            totalCost += p.getPrice();
	        }
	        this.totalCost = totalCost;
	    }

	    public String displayCartItems(){
	        List<Products> products = customer.getCartDetails().getProductList();
	        Map<Products, Long> map = products.stream()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        return map.toString();
	    }


}
