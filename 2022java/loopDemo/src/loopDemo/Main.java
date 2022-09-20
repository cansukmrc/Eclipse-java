package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("For Döngüsü Bitti");

		for (int j = 2; j < 10; j += 2) {
			System.out.println(j);
		}

		System.out.println("For Döngüsü Bitti");

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While Döngüsü Bitti");

		int j = 2;
		while (j < 10) {
			System.out.println(j);
			j += 2;
		}

		System.out.println("While Döngüsü Bitti");

		// Do-While
		int t = 1;
		do {
			System.out.println(t);
			t++;
		} while (t < 10);

		System.out.println("Do-While Döngüsü Bitti");

	}

}
