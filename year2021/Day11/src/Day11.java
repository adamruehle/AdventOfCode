public class Day11 {




    public static void main(String[] args) {

        String inputData = "2682551651\n" +
                "3223134263\n" +
                "5848471412\n" +
                "7438334862\n" +
                "8731321573\n" +
                "6415233574\n" +
                "5564726843\n" +
                "6683456445\n" +
                "8582346112\n" +
                "4617588236";

        int[][] data = new int[10][10];

        for (String line : inputData.split("\n")) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    data[i][j] = Integer.parseInt(j, j + 1);
                }
            }


        }
        System.out.println(data[1][2]);

    }
}
