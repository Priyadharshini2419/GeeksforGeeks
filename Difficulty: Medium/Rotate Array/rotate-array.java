class Solution {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
     
          
            isRotate(arr,0,d-1);
           isRotate(arr,d,n-1);
             isRotate(arr,0,n-1);
    
        
    }
    static int[] isRotate(int arr[],int start,int end){
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
        return arr;
    }
}