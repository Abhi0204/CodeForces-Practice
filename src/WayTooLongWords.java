import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 0; i <=n; i++) {
			String word = scanner.nextLine();
			if (word.length() <=10)
				System.out.println(word);
			else {
				int count = word.length() - 2;
				System.out.println(Character.toString(word.charAt(0)) + count
						+ Character.toString(word.charAt(word.length() - 1)));
			}
		}

	}

}
