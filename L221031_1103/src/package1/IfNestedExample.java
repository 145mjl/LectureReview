package package1;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}
}
