package javacollection2;

import java.util.ArrayList;

public class DemoArryLlist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nikhat");
		al.add("joy");
		al.add("chinni");
		al.add("Benz");
		System.out.println(al);
		al.set(2, "tns");
		System.out.println(al);
		al.add(2,"chinni");
		System.out.println(al);
		al.remove("tns");
		
	}

}
