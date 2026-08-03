class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(getnrow(i));
        }
        return ans;
        
    }
    private List<Integer> getnrow(int n){
        List<Integer>row = new ArrayList<>() ;
        long val = 1 ;
        row.add((int)val) ;
        for(int k = 1 ; k <n ; k++){
            val= val*(n-k)/k ;
            row.add((int) val);
        }
        return row;
    }
}