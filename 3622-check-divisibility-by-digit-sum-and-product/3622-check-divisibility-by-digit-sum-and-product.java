class Solution {
    public boolean checkDivisibility(int n) {
        if (n == 0) {
            return false; 
        }  
        int temp = Math.abs(n); 
        int sum = 0;
        int product = 1;       
        while (temp > 0) {
            int digit = temp % 10;   
            sum += digit;            
            product *= digit;       
            temp /= 10;             
        }       
        int check = sum + product;     
        if (check == 0) {
            return false;
        }
        return n % check == 0;
    }
}