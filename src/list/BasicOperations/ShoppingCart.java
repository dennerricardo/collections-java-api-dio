package list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<Item> itemList;
	
	public ShoppingCart() {
		this.itemList = new ArrayList<>();
	}
	
	public void addItem(String item) {
		itemList.add(new Item(item));
	}
	
	public void removeItem(String item) {
		List<Item> itemToRemove = new ArrayList<>();
		for (Item i : itemList) {
			if(i.getItem().equalsIgnoreCase(item)) {
				itemToRemove.add(i);
			}
		}
		itemList.removeAll(itemToRemove);
	}
	
	public int allItens() {
		return itemList.size();
	}
	
	public void itemDescription() {
		System.out.println(itemList);
	}
	public static void main(String[] args) {
		ShoppingCart itemList = new ShoppingCart();
		System.out.println("Numbers of itens: "+itemList.allItens());
		
		itemList.addItem("banana");
		itemList.addItem("banana");
		itemList.addItem("apple");
		itemList.addItem("pinapple");
		itemList.addItem("limons");
		System.out.println("Numbers of itens: "+itemList.allItens());
		
		itemList.removeItem("banana");
		System.out.println("Numbers of itens: "+itemList.allItens());
		
		itemList.itemDescription();
		
	}
}
