<<<<<<< HEAD
class ReverseStringLeetCode {
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length-1;
        
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        } 
    
    }
=======
class Solution {
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length-1;
        
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        } 
    
    }
>>>>>>> 8e34b7c (Reversing characters in array at O(1) space complexity using simple swapping :))
}