package org.example.ex_7_3;


public class Main {

	public static void main(String[] args) {
		Impl ob = new Impl();
		System.out.println(ob.myMethod(2));
		System.out.println(Iface2.myMethod(2));
	}

}
