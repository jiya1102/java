public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // System.out.print(arr[i][j]);
                sum = sum + arr[i][j];

            }
            // System.out.println(sum);
        }
        System.out.println("sum is" + sum);
    }

}