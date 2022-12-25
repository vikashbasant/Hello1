package in.co.dec;

public class Pattern {
	private static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int j;
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			int k;
			for (k = j; k <= n; k++) {
				System.out.print("* ");
			}
			for (int l = 1; l < n - i + 1; l++) {
				System.out.print("* ");
			}
			for (int m = i; m >= 1; m--) {
				System.out.print(m + " ");
			}
			System.out.println();

		}
		for (int i = 1; i <= n; i++) {

			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 4;
		printPattern(n);
	}
}
