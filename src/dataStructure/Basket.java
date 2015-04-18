package dataStructure;

import java.util.ArrayList;

public class Basket {
	//private String zipcode;
	private ArrayList<String> item_list;
	
	//public String getZipcode() { return zipcode; }
	public ArrayList<String> getItemList() { return item_list; }
	
	//public void setZipcode(String zipcode) { this.zipcode = zipcode; }
	public void setItemList(ArrayList<String> item_list) { this.item_list = this.item_list; }
	
	public void addItem(String item) { item_list.add(item); }
	
	public Basket() {}
}
