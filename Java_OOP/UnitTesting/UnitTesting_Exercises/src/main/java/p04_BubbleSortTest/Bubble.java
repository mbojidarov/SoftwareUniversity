package p04_BubbleSortTest;

public class Bubble {

    public static void sort(int[] arr) {   //metod za sortirane na elementite
        int n = arr.length;                // v edin masiv po vuzhodqsht red

        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
