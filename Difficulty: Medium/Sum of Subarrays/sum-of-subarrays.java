class Solution {
    public int subarraySum(int[] arr) {
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            total+=arr[i]*(i+1)*(n-i);
        }
        return total;
    }
}
