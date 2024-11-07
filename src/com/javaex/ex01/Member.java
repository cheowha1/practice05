package com.javaex.ex01;

public class Member {
	private String id;
	private String name;
	private int point;
	
	
	public Member(String id, String name, int point ) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + ")"+ point +"점");;
	}

}
