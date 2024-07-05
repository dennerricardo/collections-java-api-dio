package set.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class ProductRegistration  {
	
	private Set<Product> productSet ;

	public ProductRegistration() {
		this.productSet = new HashSet<>();
	}
	
	
	public void addProduct(long cod, String name, double price, int amount ) {
		productSet.add(new Product(cod, name, price, amount)) ;
	}
	
	public Set<Product> showProductsByName(){
		Set<Product> productsByName = new TreeSet<>(productSet);
		return productsByName;
	}
	
	public Set<Product> showProductsByPrice(){
		Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
		productsByPrice.addAll(productSet);
		return productsByPrice ;
	}

	public static void main(String[] args) {
		ProductRegistration productRegistration = new ProductRegistration();
		productRegistration.addProduct(1L,"SNACK 4", 12d, 2);
		productRegistration.addProduct(2L,"SNACK 1" ,22d, 5);
		productRegistration.addProduct(1L,"SNACK 2" ,23d, 7);
		productRegistration.addProduct(9L,"SNACK 3" ,51d, 4);
		
		System.out.println(productRegistration.productSet);
		System.out.println(productRegistration.showProductsByName());
		System.out.println(productRegistration.showProductsByPrice());

	}
	
}
