import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int d[][] = { { 1, 2, 3, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0, 1 } };
		for (int i = 0; i < d.length; i++) {
		for (int j = 0; j < d[i].length; j++) {
		if (d[i][j] % 2 == 0) {
		System.out.println(d[i][j]);
		}
	}
	}
	}
}

