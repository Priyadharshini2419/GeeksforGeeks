import java.util.*;

class Solution {
    Vector<Integer> addOne(int[] arr) {
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] < 9){
                arr[i]++;
                break;
            }else{
                arr[i] = 0;
            }
        }

        Vector<Integer> ans = new Vector<>();

        if(arr[0] == 0){  
            ans.add(1);
        }

        for(int x : arr){
            ans.add(x);
        }

        return ans;
    }
}