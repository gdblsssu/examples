package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static int pivotInteger(int n) {
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 1;
        rightSum[n - 1] = n;
        for(int i = 1; i < n; i++){
            leftSum[i] = leftSum[i - 1] + i;
        }
        for(int i = n - 2; i >= 0; i--){
            rightSum[i] = i + rightSum[i + 1];
        }

        for(int i = 0; i < n; i++){
            if(rightSum[i] == leftSum[i]) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        pivotInteger(8);
    }
}
