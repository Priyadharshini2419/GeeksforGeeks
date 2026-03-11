class Solution {
    void pushZerosToEnd(int[] arr) { 
        int[]a=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
              if(arr[i]!=0){
                  a[k]=arr[i];
                  k++;
              }
        }
        for(int i=k;i<arr.length;i++){
            a[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
    }
}