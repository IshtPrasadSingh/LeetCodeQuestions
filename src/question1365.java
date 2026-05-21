public class question1365 {
//    class Solution {
//        public int[] smallerNumbersThanCurrent(int[] nums) {
//
//            int n = nums.length;      // storing size in n variable
//            int[] ans = new int[n];   // new arr for storing the values of count
//
//            for(int i=0 ; i<n ; i++){
//                          iterates over loop and gives the other for loop the values by accessing them from their index
//                                      to check how many values are smaller
//
//                int count=0;  // initialising count variable with 0 and will replace with certain numbers
//                                  that are actually stored in ans array which are the counts of the
//                                  nums arr value which are smaller
//
//                for(int j=0 ; j<n ; j++){  // this loop iterates over all nums element and finds which
//                                        elements are smaller than the value we have taken from that same nums arr
//
//                    if(i != j && nums[j] < nums[i]){
//                        count++;          // if smaller found then increase the count
//                    }
//
//                }
//                ans[i] = count;  // initialise count numbers to the ans arr
//            }
//            return ans;
//        }
//    }
}
