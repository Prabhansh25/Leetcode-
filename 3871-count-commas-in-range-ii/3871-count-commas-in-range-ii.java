class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0 ;
        }
        long total = 0 ;
        for(long i = 1000 ; i<=n ; i*=1000){
            total += n-i+1 ;
        }
        return total ;
    }
}