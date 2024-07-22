package com.asmin.One_TO_MANY_SETTER_DEPENDENCY;

public class Main {
	public static void main(String[] args) {
	Item item1 = new Item();
	item1.setItemId("I-111");
	item1.setItemname("BOOK");
	item1.setItemPrice(200);
	
	Item item2 = new Item();
	item2.setItemId("I-222");
	item2.setItemname("LAPTOP");
	item2.setItemPrice(50000);
	
	Item item3 = new Item();
	item3.setItemId("I-333");
	item3.setItemname("MOBILE");
	item3.setItemPrice(20000);
	
	Item[] item = {item1,item2,item3};
	
	Order order = new Order();
	order.setOrderId("O-111");
	order.setOrdername("Needed");
	order.setDeliverydate("25-04-2024");
	order.setDeliveryAddress("Ameerpet");
	order.setItems(item);
	
	order.displayOrderDetails();
	}

}
