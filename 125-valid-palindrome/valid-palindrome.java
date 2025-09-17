class Solution {
    public boolean isPalindrome(String s) {
        // Two-pointer approach (no need to create extra string)
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Skip non-alphanumeric chars from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric chars from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true; 
    }
}
