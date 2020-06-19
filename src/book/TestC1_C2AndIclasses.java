package book;

public class TestC1_C2AndIclasses {
	
	public static void main(String[] args) {
		
		C2 obj1 = new C1();
		I obj2 = new C1();
		
		C2 s = (C2) obj2;
		I t =  (I) obj1;
		
		t.displayI();
		s.displayC2();
		System.out.println();
		obj1.displayC2();
		obj2.displayI();
	}
	
	
	

}
