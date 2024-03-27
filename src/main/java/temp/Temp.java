package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;

        int res = 0;
        int product = 1;
        for(int l = 0, r = 0; r < nums.length; r++){
            product *= nums[r];

            while(product > k){
                product /= nums[l++];
            }

            res += r - l + 1;
        }

        return res;
    }


    public static void main(String[] args) {
        numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
    }
}
