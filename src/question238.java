public class question238 {
//    class Solution {
//        public int[] productExceptSelf(int[] nums) {
//
//            //create a new array called result
//            int[] result = new int[nums.length];
//
//            //by default we are going to set all the values as 1
//
//            Arrays.fill(result,1);
//
//            //intializing pre and post variables as 1
//            int pre=1 , post=1;
//
//            //running a for loop from left to right and update the value of pre inside ans array
//            for(int i=0; i<nums.length; i++){
//                result[i] = pre; // updating value inside result array
//                pre = nums[i]*pre; // updating our prefix variable
//            }
//            //after loop ends we should have prefix filled out for every single position inside our result array
//
//            //now this loop will come in reverse order
//            for(int i=nums.length-1; i>=0; i--){
//                result[i] = result[i]*post; //this will update the value inside result array and it will be the multiplication of whatever the value we already had to postfix variable
//                post = post*nums[i]; //updating the value of postfix variable
//            }
//            return result;
//        }
//    }


}
