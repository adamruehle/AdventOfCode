public class Day6 {

	public static void main(String[] args) {

		// Input Fish Values
		int[] inputData = { 3, 3, 2, 1, 4, 1, 1, 2, 3, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 4, 1, 1, 5, 2, 1, 1, 2, 1, 1, 1,
				3, 5, 1, 5, 5, 1, 1, 1, 1, 3, 1, 1, 3, 2, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 4, 1, 3, 3, 1, 1, 3,
				1, 3, 1, 2, 1, 3, 1, 1, 4, 1, 2, 4, 4, 5, 1, 1, 1, 1, 1, 1, 4, 1, 5, 1, 1, 5, 1, 1, 3, 3, 1, 3, 2, 5, 2,
				4, 1, 4, 1, 2, 4, 5, 1, 1, 5, 1, 1, 1, 4, 1, 1, 5, 2, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 1, 3, 1, 5, 3, 2,
				1, 1, 2, 2, 1, 2, 1, 1, 5, 1, 1, 4, 5, 1, 4, 3, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 5, 2, 1, 1, 1, 5, 1, 1, 1,
				4, 4, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 4, 4, 1, 4, 1, 1, 5, 3, 1, 1, 1, 5, 2, 2, 4, 2, 1, 1, 3, 1, 5, 5,
				1, 1, 1, 4, 1, 5, 1, 1, 1, 4, 3, 3, 3, 1, 3, 1, 5, 1, 4, 2, 1, 1, 5, 1, 1, 1, 5, 5, 1, 1, 2, 1, 1, 1, 3,
				1, 1, 1, 2, 3, 1, 2, 2, 3, 1, 3, 1, 1, 4, 1, 1, 2, 1, 1, 1, 1, 3, 5, 1, 1, 2, 1, 1, 1, 4, 1, 1, 1, 1, 1,
				2, 4, 1, 1, 5, 3, 1, 1, 1, 2, 2, 2, 1, 5, 1, 3, 5, 3, 1, 1, 4, 1, 1, 4 };

		// Create Data Array.
		int[] data = new int[inputData.length];
		for (int i = 0; i < inputData.length; i++) {
			data[i] = inputData[i];
		}

		int count = 0;
		// Loop 80 times (days) over the array
		for (int day = 0; day < 256; day++) {

			// The length of the new array should include how many zeros there are.
			int countOfZeros = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i] == 0) {
					countOfZeros++;
				}
			}

			// Create fish array which will be the new data array.
			int[] fish = new int[data.length + countOfZeros];
			System.out.println(count);
			count++;
			for (int i = 0, end = fish.length - 1; i < data.length; i++) {
				if (data[i] < 9 && data[i] > 0) {
					fish[i] = data[i] - 1;
				}
				else {
					fish[i] = 6;
					fish[end] = 8;
					end--;
				}
			}

			// Assign fish to data
			data = fish;
		}
		// Part 1 Answer:
		System.out.print("Length: " + data.length);
		// The problem for part 2 is that the array becomes way too large for 256
		// gigabytes. The heap cannot hold all the data being created.
	}
}
