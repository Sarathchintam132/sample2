package collectionss;

import java.util.ArrayList;

public class Demo_01 {
	
	public static void main(String[] args) {
		
		//arraylist
  //bug 01
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
//bug 02
		al.add(30);
		al.add(40);
		System.out.println("===========loop begins===========");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
