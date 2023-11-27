package Modules.Module3.Lab2;

import java.util.*;

public class Sliding_Subarray_Beauty {
    public static List<Integer> slidingSubarrayBeauty(int[] arr, int k, int n) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int[] subarray = Arrays.copyOfRange(arr, i, i + k);
            Arrays.sort(subarray);
            result.add(subarray[n - 1]);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().strip().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        List<Integer> result = slidingSubarrayBeauty(arr, k, n);
        for (int beauty : result) {
            System.out.print(beauty + " ");
        }
    }
}
