class Solution {
    public void reverseArray(int arr[]) {
        int n=arr.length;
    int arr1[]=new int[n];
    int k=0;
    for(int i=n-1;i>=0;i--){
        arr1[k]=arr[i];
        k++;
    }
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }
        
    }
}