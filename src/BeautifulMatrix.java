import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulMatrix {

	public static String[][] getMatrix(BufferedReader inp) throws IOException {
		String[] storeLine;
		String[][] matrix = new String[6][6];
		int flag = 0;

		for (int i = 1; i <= 5; i++) {
			String line = inp.readLine();
			storeLine = line.trim().split(" ");

			for (int k = 1; k <= 5; k++) {
				matrix[i][k] = storeLine[flag];
				flag++;
			}
			flag = 0;

		}
		return matrix;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader inp = new BufferedReader(
				new InputStreamReader(System.in));

		String[][] matrix = getMatrix(inp);
		int rowdiff = 0;
		int columndiff = 0;
		int flag = 0;

		for (int i = 1; i <= 5; i++) {
			if (flag == 1) {
				break;
			}
			for (int k = 1; k <= 5; k++) {
				if (matrix[i][k].equals("1")) {
					rowdiff = i - 3;
					columndiff = k - 3;
					flag = 1;
					break;
				}

			}

		}

		if (rowdiff < 0) {
			rowdiff = -(rowdiff);
		}
		if (columndiff < 0) {
			columndiff = -(columndiff);
		}
		System.out.print(rowdiff + columndiff);

	}
}
