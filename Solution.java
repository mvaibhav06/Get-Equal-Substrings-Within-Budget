class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int cost = 0;
        int out = 0;
        int i = 0;
        int j = 0;

        while(j < s.length()){
            int a = s.charAt(j);
            int b = t.charAt(j);
            cost += Math.abs(a-b);
            
            if(cost > maxCost){
                out = Math.max(out, j-i);
                while(cost > maxCost && i<=j){
                    int p = s.charAt(i);
                    int q = t.charAt(i);
                    cost -= Math.abs(p-q);
                    i++;
                }
            }
            j++;
        }
        out = Math.max(j-i, out);
        return out;
    }
}
