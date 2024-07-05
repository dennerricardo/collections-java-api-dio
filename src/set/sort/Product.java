package set.sort;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
	
	private long code;
	private String name;
	private double price;
	private int amount;
	
	public Product(long code, String name, double price, int amount) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	@Override
	public int compareTo(Product p) {
		return name.compareTo(p.getName());
	} 

	public long getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Product ["+ code +", " + name + ", " + price + ", " + amount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return code == other.code;
	}
	
}


class ComparatorByPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
	
	
	
}

