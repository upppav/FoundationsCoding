package foundationCoding;
import java.util.*;

public class VendingMachine {
	List<Products> productList;
	VendingMachineAdmin vendingMachineAdmin;
	VendingMachine(){
		productList=new ArrayList<>();
	}
	public void addProducts(Products product)
	{
		productList.add(product);
	}
    public void displayDetails() {
    	Map<Integer,Products> map=vendingMachineAdmin.getMappingProduct();
    	for(Integer k:map.keySet()) {
    		System.out.println(k+"."+map.get(k)+"Quantity :"+vendingMachineAdmin.getMappingQuantity().get(map.get(k)));
    	}
    }
    public List<Products> getProductList(){
		return productList;
    	
    }
    public void setVendingMachineAdmin(VendingMachineAdmin vendingMachineAdmin) {
    	this.vendingMachineAdmin=vendingMachineAdmin;
    }
	public VendingMachineAdmin getVendingMachineAdmin() {
		return vendingMachineAdmin;
	}
	public void removeFromVending(Products product) {
		// TODO Auto-generated method stub
		try {
			getProductList().remove(product);
			updateTheQuantity(product);
		}catch(ProductNotThereException p)
		{
			System.out.println(p.getMessage());
		}
		
	}
	private void updateTheQuantity(Products product)throws ProductNotThereException {
		int getQ=vendingMachineAdmin.getMappingQuantity().get(product);
		getQ=-1;
		if(getQ<0) throw new ProductNotThereException("Quantity should not exceed the available quantity");
		vendingMachineAdmin.getMappingQuantity().put(product,getQ);
		// TODO Auto-generated method stub
		
	}

}
