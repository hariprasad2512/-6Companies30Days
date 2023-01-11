class Solution {
   public int countNicePairs(int[] nums) {
        int M = 10000007;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i < j){
                    int lhs = nums[i] + rev(nums[j]);
                    int rhs = nums[j] + rev(nums[i]);

                    if(lhs == rhs){
                        count++;
                    }
                }
            }
        }
        return count % M;
    }
    public static int rev(int x){
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String reverse = sb.reverse().toString();
        return Integer.parseInt(reverse);
    }
}
