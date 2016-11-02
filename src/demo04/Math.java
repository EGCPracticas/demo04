package demo04;

public class Math {
	public static int sum(int i, int j) {
		return i+j;
	}
	
	public static int sum(int i, int j, int k) {
		return sum(i, sum(j, k));
	}
}
