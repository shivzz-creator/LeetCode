class Solution {
    public List<String> generateParenthesis(int n) {
        ans.clear();
         f(0,0,"",n);
        
        return ans ;
    }
    
    static List<String> ans  =  new ArrayList<>();
    
    public void f( int oc , int cc , String a , int n){
            
        if(oc==n && cc==n){
            ans.add(a);
            return;
        }
        if(oc!=n){
            f(oc+1,cc,a+"(",n);
        }
        if(oc>cc && cc!=n){
            f(oc,cc+1,a+")",n);
        }
        
        
    }
}