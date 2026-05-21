public class question128 {
    class Solution {
  //      public int longestConsecutive(int[] nums) {

            // HASH SET soln as it gives O(n) TC

            // start with edge case i.e checking if arr is empty
  //          if(nums.length ==0){
    //            return 0;
      //      }
        //    HashSet<Integer> numSet = new HashSet<>(); // hashset created naming numset

            //running a for loop in given input and storing values to our hashset
//            for(int i=0; i<nums.length; i++){
  //              numSet.add(nums[i]); // it'll do two things eliminate duplicates and store the unique ones
    //        }
            //we're going to create a parameter to create the longest subsequence
 //           int longestSub = 1;

//            for(int num: numSet){ // running for loop against given numSet
  //              if(numSet.contains(num-1)){
    //                continue;
      //          }
        //        else{
          //          int currentNum = num;
            //        int currentSub = 1;

//            while(numSet.contains(currentNum+1)){
  //                      currentNum++;
    //                    currentSub++;
      //              }
        //            longestSub = Math.max(longestSub, currentSub);
          //      }
 //           }
   //         return longestSub;
//       }
   }
}
