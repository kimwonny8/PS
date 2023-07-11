import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
		int pickNum = nums.length / 2;
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		if(pickNum >= set.size()) return set.size();
		else return pickNum;
    }
}