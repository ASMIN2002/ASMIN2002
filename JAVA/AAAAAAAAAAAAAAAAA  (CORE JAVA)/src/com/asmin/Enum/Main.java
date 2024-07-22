package com.asmin.Enum;

enum NoteBook{
	A(300,150),B(400,200),C(500,250);
	
	private int pages;
	private int price;
	
	NoteBook(int pages,int price){
		this.pages=pages;
		this.price=price;
		
	}
	public int getPages() {
		return pages;
	}
	public int getPrice() {
		return price;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("TYPE\tPAGES\tPRICE");
		System.out.println("----------------------");
		System.out.println("A\t"+NoteBook.A.getPages()+"\t"+NoteBook.A.getPrice());
		System.out.println("B\t"+NoteBook.B.getPages()+"\t"+NoteBook.B.getPrice());
		System.out.println("C\t"+NoteBook.C.getPages()+"\t"+NoteBook.C.getPrice());

	}

}
