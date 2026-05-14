import java.util.HashSet;
//Question 217

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        //create a hashset to store elements from the array

        for (int num : nums) {
            //check if the element is already in the hashset
            if (seenNumbers.contains(num)) {
                return true; //duplicate found
            }
            //add elements to the hashset
            seenNumbers.add(num);
        }

        return false; // duplicate not found
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);

        System.out.println(result);
    }
}
//............................................................
// IN LEETCODE

//    class question217{
//        public boolean containsDuplicate(int[] nums) {
//            HashSet<Integer> seenNumbers = new HashSet<>();
//
//             //create a hashset to store elements from the array
//            for(int num: nums){
//                //check if the element is already in the hashset
//                if(seenNumbers.contains(num)){
//                    return true; // duplicate found
//                }
//                //add elements to the hashset
//                seenNumbers.add(num);
//            }
//            return false; // no duplicate
//        }
//    }
//}
