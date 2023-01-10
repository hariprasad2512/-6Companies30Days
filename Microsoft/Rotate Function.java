class Solution {
        public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long f[] = new long[n];
        for(int i=0;i<n;i++){
            f[0] += nums[i] * i;
        }
        int k=1;
        while(k<n){
        int temp = nums[n-1];
        for(int i=n-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;

        for(int i=0;i<n;i++){
            f[k] += nums[i] * i;
        }
            k++;
        }
        
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(f[i] > max){
                max = f[i];
            }
        
        }
        return (int)max;
        

    }
}
