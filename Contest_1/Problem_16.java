//16
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        int l = s.length();
        for(int i=0; i<l-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}