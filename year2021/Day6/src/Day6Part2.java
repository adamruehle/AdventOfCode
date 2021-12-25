public class Day6Part2 {

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

		// Part 2 forces the program to overload on the heap. Integer values are not
		// large enough (2^31 or 4.2 billion) is less than the number of fish that there
		// will be in the end. A long integer goes up to 2^63.
		long zeros = 0;
		long ones = 0;
		long twos = 0;
		long threes = 0;
		long fours = 0;
		long fives = 0;
		long sixes = 0;
		long sevens = 0;
		long eights = 0;

		for (int i = 0; i < inputData.length; i++) {
			if (inputData[i] == 1) {
				ones++;
			} else if (inputData[i] == 2) {
				twos++;
			} else if (inputData[i] == 3) {
				threes++;
			} else if (inputData[i] == 4) {
				fours++;
			} else if (inputData[i] == 5) {
				fives++;
			}
		}
		System.out.println("zeros: " + zeros + ". ones: " + ones + ". twos: " + twos + ". threes: " + threes
				+ ". fours: " + fours + ". fives: " + fives + ". sixes: " + sixes + ". sevens: " + sevens + ". eights: "
				+ eights
				+ "\nThis is out of " + (ones + twos + threes + fours + fives + sixes + sevens + eights)
				+ " inputData values.");

		long[] data = { zeros, ones, twos, threes, fours, fives, sixes, sevens, eights };

		for (int day = 0; day < 256; day++) {

			zeros = data[0];
			ones = data[1];
			twos = data[2];
			threes = data[3];
			fours = data[4];
			fives = data[5];
			sixes = data[6];
			sevens = data[7];
			eights = data[8];

			data[8] = zeros;
			data[7] = eights;
			data[6] = zeros + sevens;
			data[5] = sixes;
			data[4] = fives;
			data[3] = fours;
			data[2] = threes;
			data[1] = twos;
			data[0] = ones;

			System.out.println(data[1] + "  " + data[0]);

		}

		long fishiesCount = 0;
		for (int i = 0; i < data.length; i++) {
			fishiesCount += data[i];
		}
		System.out.println("The final fishies count will be: " + fishiesCount);
	}
}
