public class missingArr {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 1, 2, 5 };
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + i;

        }
        // System.out.println(sum1);
    }

    int sum2 = 0;
    {
        for (int i = 0; i <= 5; i++) {
            sum2 = sum2 + i;
        }
        system.out.printin(sum2 - sum1);

    }
}
