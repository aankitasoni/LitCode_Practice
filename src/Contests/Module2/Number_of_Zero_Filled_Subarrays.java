package Contests.Module2;

import java.util.*;

public class Number_of_Zero_Filled_Subarrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        int result = countZeroFilledSubarrays(nums);
        System.out.println(result);
    }


    private static int countZeroFilledSubarrays(int[] nums) {
        int count = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 0) {
                currentCount++;
            } else {
                count += (currentCount * (currentCount + 1)) / 2;
                currentCount = 0;
            }
        }

        count += (currentCount * (currentCount + 1)) / 2;

        return count;
    }
}
