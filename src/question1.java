import java.util.HashMap;
import java.util.Map;
//QUESTION 1
public class question1 {

    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {

                // If found, return the indices
                return new int[]{map.get(complement), i};
            }

            // Otherwise, add current number and its index to the map
            map.put(nums[i], i);
        }

        // Return empty array if no solution found
        return new int[]{};
    }


    public static void main(String[] args) {

        // Class name should match: question1
        question1 obj = new question1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
