package map.search;

import java.util.HashMap;
import java.util.Map;



public class StorageOfProducts {

	private Map<Long, Product> storageOfProducts ;

	public StorageOfProducts() {
		this.storageOfProducts = new HashMap<>();
	}
	
	public void addProduct(Long cod, String name, int amount, double price) {
		storageOfProducts.put(cod, new Product(name, price, amount));
		
	}
	
	public double finalValue() {
		double storageValue = 0d;
		if(!storageOfProducts.isEmpty()) {
			for(Product p : storageOfProducts.values()) {
				storageValue += p.getAmount() * p.getPrice();
			}
		}
		return storageValue;
	}
	
	public Product expensivestProduct() {
		Product expensivestProduct = null;
		double  highestPrice = Double.MIN_VALUE ;
		if(!storageOfProducts.isEmpty()) {
			for(Product p : storageOfProducts.values()) {
				if(p.getPrice()> highestPrice) {
					expensivestProduct = p;
				}
			}
		}
		return expensivestProduct;
	}
	
	public void showProducts() {
		System.out.println(storageOfProducts);
	}
	
	
public static void main(String[] args) {
		
		StorageOfProducts storageOfProducts = new StorageOfProducts();
		
		storageOfProducts.showProducts();
		storageOfProducts.addProduct(1L,"Product 1" , 10, 5.0 );
		storageOfProducts.addProduct(2L,"Product 2" , 15, 8.0);
		storageOfProducts.addProduct(3L,"Product 3" , 3, 5.0);
		storageOfProducts.addProduct(4L,"Product 4" , 2, 10.0);
		storageOfProducts.addProduct(5L,"Product 5" , 4, 15.3);
		
		storageOfProducts.showProducts();
		
		System.out.println(storageOfProducts.finalValue());
		System.out.println(storageOfProducts.expensivestProduct());

	}
	
	
	

}
