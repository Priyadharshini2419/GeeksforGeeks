import java.util.*;

class Solution {
    int maxProduct(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int option1 = arr[n-1] * arr[n-2] * arr[n-3];
        int option2 = arr[0] * arr[1] * arr[n-1];

        return Math.max(option1, option2);
    }
}