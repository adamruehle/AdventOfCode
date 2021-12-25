
public class Day1 {

	public static void main(String[] args) {

		int[] data = { 199, 200, 208, 210, 200, 207, 240, 269, 260, 263 };
		int[][] editedData = new int[200][10];
		int k = 0;
		for (int i = 0; i < editedData.length - 1; i++) {
			for (int j = 0; j < editedData[0].length - 1; j++) {
				editedData[i][j] = data[k];
				k++;
			}
		}

		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;

		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] < data[i + 1]) {
				count++;
			}
		}
		System.out.println(count + " measurements are larger than the previous measurement.");
	}
}
