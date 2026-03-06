import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int x : arr){
            list.add(x);
        }
        
        Collections.sort(list);
        
        int largest = list.get(n-1);
        
        for(int i = n-2; i >= 0; i--){
            if(list.get(i) != largest){
                return list.get(i);
            }
        }
        
        return -1;
    }
}