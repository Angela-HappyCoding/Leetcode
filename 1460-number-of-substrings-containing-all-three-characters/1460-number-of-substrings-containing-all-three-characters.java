class Solution {
    public int numberOfSubstrings(String s) {
        if (s.length() < 3) return 0;
        int[] map = new int[3];
        int start = 0;
        int count = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            map[c - 'a']++;
            while (map[0] > 0 && map[1] > 0 && map[2] > 0){
                count += s.length() - end;
                map[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return count;
    }
}