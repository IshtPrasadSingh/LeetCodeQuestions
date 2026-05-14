public class question49 {

    //LEETCODE Q 49

//    class Solution {
//        public List<List<String>> groupAnagrams(String[] strs) {
//
//            if(strs.length == 0){
//                return new ArrayList<>();
//            }
//            Map<String,List<String>> ansMap = new HashMap<>();
//
//            int[] count = new int[26];
//
//            for(String s:strs){
//                Arrays.fill(count,0);
//                //iterating over the string s and add all the characters inside the array by adding their value from 0 to 1
//                for(char c:s.toCharArray()){
//                    count[c - 'a']++;
//                }
// initialise the string builder to store the string value that we have retrieved inside the character array
//                StringBuilder sb = new StringBuilder("");
//
// run across the count array and add the value to the string builder
//                for(int i=0; i<26; i++){
//                    sb.append("#");
//                    sb.append(count[i]);
//                }
//                // assign the new string as a key for our hashmap
//                String key = sb.toString();
//                if(!ansMap.containsKey(key)){
//                    ansMap.put(key,new ArrayList<>());
//                }
//                ansMap.get(key).add(s);
//            }
//            return new ArrayList<>(ansMap.values());
//        }
//    }
}
