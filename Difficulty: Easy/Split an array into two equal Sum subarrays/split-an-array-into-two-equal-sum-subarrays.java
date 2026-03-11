class Solution {
    public boolean canSplit(int arr[]) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int psum = 0;

        for(int i = 0; i < arr.length - 1; i++){
            psum += arr[i];

            if(psum == sum - psum){
                return true;
            }
        }

        return false;
    }
}