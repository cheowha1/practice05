package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	public Goods() {
		                       // 수정 한곳 (추가로 public 하나 만듬)
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	void setName(String name) {   // 수정한곳 public void 였는데 public 뺏음
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}




