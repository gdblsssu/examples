package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correctInd = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctInd])
                swap(nums, i, correctInd);
            else
                i++;
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1) return i + 1;
        }

        return nums.length + 1;
    }

    private static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind2] = arr[ind1];
        arr[ind2] = temp;
    }


    public static void main(String[] args) {
        firstMissingPositive(new int[]{3, 4, -1, 1});
    }
}
