public class Increments {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(++x * 2);	// 12
		System.out.println("x = " + x);

		x = 5;
		System.out.println(x++ * 2);	// 10
		System.out.println("x = " + x);
	}
}
