public class copyarray {
    public static void main(String[] args) {
        int[] arr1 = { 5, 2, 4 };
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];

        }
        System.out.println("copied array");
        for (int val : arr2) {
            System.out.println(val + " ");
        }

    }

}
