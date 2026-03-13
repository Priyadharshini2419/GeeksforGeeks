// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                break;
            }
            else{
                arr[i]=0;
            }
        }
        Vector<Integer>r=new Vector<>();
        if(arr[0]==0){
            r.add(1);
        }
        for(int x:arr){
            r.add(x);
        }
        return r;
    }
}