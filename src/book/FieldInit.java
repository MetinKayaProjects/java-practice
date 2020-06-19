package book;

public class FieldInit {
	Character c;
	boolean b;
	float f;
	
	void printAll() {
		System.out.println("c: " + c);
		System.out.println(b);
		System.out.println(f);
	}
	public static void main(String[] args) {
		FieldInit fieldInit = new FieldInit();
				fieldInit.printAll();
	}

}
