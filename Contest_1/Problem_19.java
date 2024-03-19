//19
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int c = 0;
        int n = s.length();
        HashSet<Character> charSet = new HashSet<>();

        for (int r = 0; r < n; r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(s.charAt(r));
            c = Math.max(c, r - l + 1);
        }

        return c;       
    }
}