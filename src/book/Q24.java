package book;

import java.awt.List;
import java.util.ArrayList;

public class Q24 {
	public static void main(String[] args) {
//		int [] data = {2010, 2013, 2014, 2015, 2014};
//		int key = 2014;
//		int count=0;
//		for(int e:data) {
//			if (e!=key) {
//				count++;
//				continue;
//			//	count++;
//				
//			}
//		}
//		System.out.println(count+" Found");
//		
//		String ta = "ABC";
//		ta = ta.replace('C', 'D');
//		
//		System.out.println(ta);
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		//colors.remove(2);
		colors.add(3, "cyan");
		System.out.println(colors);
		
	}

}
