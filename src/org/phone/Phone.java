package org.phone;

public class Phone {
	
	private void phoneInfo(int piece) {
		System.out.println(piece);
	}
	
	private void phoneInfo(String Name) {
		System.out.println(Name);
	}

	public static void main(String[] args) {
		
		Phone p=new Phone();
		p.phoneInfo(289);
		p.phoneInfo("Note 5 Pro");

	}

}
