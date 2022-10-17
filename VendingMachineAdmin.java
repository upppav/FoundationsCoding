package foundationCoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineAdmin {
     VendingMachine vendingMachine;
     Map<Products,Integer> mappingQuantity;
     Map<Integer,Products> mappingProduct;
     VendingMachineAdmin()
     {
    	 mappingQuantity=new HashMap<>();
    	 mappingProduct=new HashMap<>();
     }
     
    
     public void addProductsInVending(Products product, int quantity){
         if(mappingQuantity.containsKey(product)){
             int q = mappingQuantity.get(product);
             q  += quantity;
             mappingQuantity.put(product, q);
         }else{
             mappingQuantity.put(product, quantity);
         }
         for(int i=0; i<quantity; i++){
             vendingMachine.addProducts(product);
         }

     }

     public String displayProducts(){
         return mappingQuantity.toString();
     }

     public void setVendingMachine(VendingMachine vendingMachine) {
         this.vendingMachine = vendingMachine;
     }

     public void mappingTheProduct(int option, int quantity){
         Products product = null;
         switch (option){
             case 1:
                 product = new Chacolate("Chocolate", 20);
                 break;
             case 2:
                 product = new Snacks("Chips", 20);
                 break;
             case 3:
                 product = new FruitJuice("Juice", 30);
                 break;
             case 4:
                 product = new ColdDrink("Coke", 25);
                 break;
             case 5:
                 product = new Milk("Milk", 30);
                 break;
             default:
                 System.out.println("Enter valid value");
         }
         mappingProduct.put(option, product);
         addProductsInVending(product, quantity);
     }

     public Map<Products, Integer> getMappingQuantity() {
         return mappingQuantity;
     }

     public Map<Integer, Products> getMappingProduct() {
         return mappingProduct;
     }

}
