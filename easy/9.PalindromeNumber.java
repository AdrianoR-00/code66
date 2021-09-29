class Solution {
    public boolean isPalindrome(int x) {
        String normal = String.valueOf(x);
        char[] c = normal.toCharArray();
        String reverse = "";
        for(int i = c.length-1; i >= 0; i--) reverse += c[i];
        return (boolean) 
            ((normal.compareTo(reverse) == 0) ? true : false);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(-121));
    }
}
