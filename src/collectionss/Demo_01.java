package collectionss;

import java.util.ArrayList;

public class Demo_01 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("===========loop begins===========");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
