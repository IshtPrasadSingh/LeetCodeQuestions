public class question125 {
    class Solution {
        public boolean isPalindrome(String s) {

            //initialising pointers variables
            int left = 0;
            int right = s.length() -1;

            while(left<right){
                //checking for alphanumeric if left<right and move on if found
                while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }
                //same for right pointer and if found then come backwards
                while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                }
                //checking the value of left and right if same then continue updating the loop else false
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                //else updating the left and right pointers
                left++;
                right--;
            }
            return true;
        }

    }
}
