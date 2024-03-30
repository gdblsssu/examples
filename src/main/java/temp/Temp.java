package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int[] dif = new int[nums.length + 1];
        int res = 0;
        int cur = 0;

        for(int l = 0, r = 0; r < nums.length; r++){
            if(dif[nums[r]]++ == 0){
                k--;
            }

            if(k < 0){
                --dif[nums[l++]];
                k++;
                cur = 0;
            }

            if(k == 0){
                while(dif[nums[l]] > 1){
                    --dif[nums[l++]];
                    cur++;
                }
            }

            res += (cur + 1);
        }

        return res;
    }


    public static void main(String[] args) {
        subarraysWithKDistinct(new int[]{1, 2, 1, 3, 4}, 2);
    }
}
