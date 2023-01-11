class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if(n==1){
            return 1;
        }
        if(n == 2){
            return (double)1/n;
        }
            return 0.5;
        

    }
}
