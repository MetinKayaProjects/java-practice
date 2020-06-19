package book;

public class Q5 {
	public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0, 20.0);
		
	}
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer Sum: " + (x+y));
	}
	public static void doSum(double x, double y) {
		System.out.println("double Sum: " + (x+y));
	}
	public static void doSum(float x, float y) {
		System.out.println("float Sum: " + (x+y));
	
	}
	public static void doSum(int x, int y) {
		System.out.println("int Sum: " + (x+y));
	
	}

}
