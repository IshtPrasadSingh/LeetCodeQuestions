public class question347 {
//    class Solution {
//        public int[] topKFrequent(int[] nums, int k) {
//
////edge case if the given k is equal to the value of nums we would just return nums
//            if(k == nums.length){
//                return nums;
//            }
//// initializing our hashmap
//            Map<Integer,Integer> count = new HashMap<>();
//
////iterate over all the elements that are present inside the given nuums
//
//// so we are going to run a for loop and after it ends we are going to populate the values inside our hashmap that we have just created

//            for(int n:nums){
//                count.put(n,count.getOrDefault(n,0)+1);
//            }
//
////now we are going to initialize our priority queue
//// and inside it we are going to assign the method of insertion

//            Queue<Integer> heap = new PriorityQueue<>(
//
//// we are inserting based on the number of occurances which is based on this count hashmap

//                    (a,b) -> count.get(a) - count.get(b));
//
//
//// now everything is set up now we have to iterate over all the keys that are present inside the count hashmap
 ////and for every single key we are going to add that value to our heap priority and
////whenever the Priority Queue gets full size of this 'K' we are going to pop the element and
//// that element is going to be the least occuring element......so we are only keeping higher occuring elements inside our Heap

//            for(int n:count.keySet()){
//                heap.add(n);
//                if(heap.size() > k){
//                    heap.poll();
//                }
//            }
//
//// now we have to initialize a very simple array called ans and
////populate this ans array using a for loop on K times and we will keep on polling the values from our heap and return the answer
//
//            int[] ans = new int[k];
//            for(int i=0; i<k; i++){
//                ans[i] = heap.poll();
//            }
//            return ans;
//        }
//    }
}
