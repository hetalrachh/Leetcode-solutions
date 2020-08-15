class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
        //store nulber and index
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for(int i=0; i< nums.length; i++) {
            //if map contains target - num[i]
            if(hashMap.containsKey(target - nums[i])) { 
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
                return result;
            }
            
            hashMap.put(nums[i], i);
            
        }
        return result;
        
    }
}

//Time complexity = O(N)
//Space complexity = O(N)