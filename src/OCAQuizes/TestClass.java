package OCAQuizes;

public class TestClass {
	public static void main(String[] args) {
		int numbers[] = {12,13,42,32,15,156,23,51,12};
		int max = findMax (numbers);
		System.out.println(max);
	}
	public static int findMax(int[] numbers) {
		int max = 0;
		for(int m : numbers) {
			if (m > max) {
				max = m;
			}
		}
		return max;
	}

}
