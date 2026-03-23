class Solution {
    int majorityElement(int arr[]) {
        int n=arr.length;
        int m=n/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int x:arr){
            if(map.get(x)>m){
                return x;
            }
        }
        return -1;
    }
}