class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String , Integer> hm =  new HashMap<>();
        for(String s : cpdomains){
            String [] arr = s.split("\\s");
            int f = Integer.parseInt(arr[0]);
            
            String [] sa  =  arr[1].split("\\.");
            String sf = "";
            for(int i = sa.length-1 ; i>=0 ; i--){
                sf = sa[i]+sf;
                hm.put(sf,hm.getOrDefault(sf,0)+f);
                sf =  "." + sf;
            }         
            
        }
        
        List<String> ans  =  new ArrayList<>();
        for(String key : hm.keySet()){
            ans.add( hm.get(key)+" "+key);
        }
        return ans;
    }
}