class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> a = new ArrayList<>();
        
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                a.add(start + 1);
                a.add(end + 1);
                return a;
            }
        }

        a.add(-1);
        return a;
    }
}