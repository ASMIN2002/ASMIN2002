package com.asmin.One_TO_MANY_SETTER_DEPENDENCY;

public class Order {
		private String orderId;
		private String ordername;
		private String deliverydate;
		private String deliveryAddress;
		private Item[] items;
		
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getOrdername() {
			return ordername;
		}
		public void setOrdername(String ordername) {
			this.ordername = ordername;
		}
		public String getDeliverydate() {
			return deliverydate;
		}
		public void setDeliverydate(String deliverydate) {
			this.deliverydate = deliverydate;
		}
		public String getDeliveryAddress() {
			return deliveryAddress;
		}
		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}
		public Item[] getItems() {
			return items;
		}
		public void setItems(Item[] items) {
			this.items = items;
		}
		
		public void displayOrderDetails() {
			System.out.println("Order Details");
			System.out.println("-------------------");
			System.out.println("Order Id     : "+orderId);
			System.out.println("Order name   : "+ordername);
			System.out.println("Delivery Date   : "+deliverydate);
			System.out.println("Delivery Address  : "+deliveryAddress);
			System.out.println();
			
			System.out.println("ITEMID\tITEMNAME\tITEMPRICE");
			System.out.println("------------------------------");
			for(Item item:items) {
				System.out.print(item.getItemId()+"\t");
				System.out.print(item.getItemname()+"\t\t");
				System.out.print(item.getItemPrice()+"\n");
			}
			
		}
		
		
}
