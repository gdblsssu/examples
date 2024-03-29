package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static long countSubarrays(int[] nums, int k) {
        int count = 0;
        int res = 0;
        int max = Arrays.stream(nums).max().getAsInt();

        for(int l = -1, r = 0; r < nums.length; r++){
            if(nums[r] == max) count++;
            if(count >= k) res++;

            while(count > k){
                l++;
                if(nums[l] == max) count--;
            }
        }

        return res;

    }


    public static void main(String[] args) {
        System.out.println("<i> asd </i>");
    }
}
