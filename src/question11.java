public class question11 {
    class Solution {
        public int maxArea(int[] height) {

            int max=0; // variable max to store the maxm value of area
            int left= 0; // left pointer
            int right= height.length-1; // right pointer initialisation

            while(left<right){
                int width = right-left;  // width calculation for area
                int area= Math.min(height[left],height[right])*width; // this will calculate the area and height will be the minm of the  two

                max = Math.max(max,area);  // this will tell whether the area found was greater than the stored ....if greater then update the max variable

                if(height[left] <= height[right]){ //check which pointer has more values the less one will be increased ..this one checks for the left
                    left ++;
                }
                else{
                    right--;
                }
            }
            return max;
        }
    }
}
