class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length-1 ;
        Set<Integer> ans= new HashSet<>() ;
        for(int i =0 ; i<=n ; i++){
            if(digits[i]%2 == 1){
                continue ;
            }
            for(int j = 0 ; j<=n ; j++){
                if(i==j){
                    continue ;
                }
                for(int k = 0 ; k <=n ; k++){
                    if(digits[k] ==0 || k==j || k==i){
                        continue ;
                    }
                    int number = digits[i]*100 + digits[j]*10 +digits[k] ;
                    ans.add(number) ;
                }
            }
        }
         return ans.size() ;   
    }
}