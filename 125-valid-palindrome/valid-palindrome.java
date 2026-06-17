class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1=s.replaceAll("[^a-z0-9]","");
        String sb =new StringBuffer(s1).reverse().toString();
        return sb.equals(s1);        
    }
}