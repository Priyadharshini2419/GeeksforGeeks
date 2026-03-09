class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n=arr.length;
        int tem;
  for(int i=0;i<n;i+=k){
      int l=i;
      int r=Math.min(i+k-1,n-1);
      while(l<r){
        
          tem=arr[l];
          arr[l]=arr[r];
          arr[r]=tem;
          l++;
          r--;
      }
  }
   
    }
}