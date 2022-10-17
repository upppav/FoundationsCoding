package foundationCoding;

import java.util.*;

public class CartDetails {
      List<Products> productList;
      VendingMachine vendingMachine;
      public CartDetails() {
    	  productList=new ArrayList<>();
    	  
      }
	public List<Products> getProductList() {
		return productList;
	}
	
	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}
	public void addProductList(Products product,int quantity)
	{
		for(int i=0;i<quantity;i++)
		{
			this.productList.add(product);
			vendingMachine.removeFromVending(product);
		}
	}
	public void getTheProduct(int option,int quantity) {
		Products product=vendingMachine.getVendingMachineAdmin().getMappingProduct().get(option);
		addProductList(product,quantity);
	}
	public VendingMachine getVendingMachine() {
		return vendingMachine;
	}
	public void setVendingMachine(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
      

}
