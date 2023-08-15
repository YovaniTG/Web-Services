import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 1,1,2 };
		// p a p e r --key
		// t i t l e --val
		//System.out.println(isIsomorphicStr("eggrswq", "adf"));
		//System.out.println(isIsomorphicStr("paper", "title"));// "eggrswq","adf"
		//System.out.println(isIsomorphicStr("eggrswqsdjkfvsdjkvkjsdvkj", "adf"));
		//System.out.println(removeDuplicates(numArr));

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
	
	 public int[] twoSum1(int[] nums, int target) {
	        
	        if(nums.length != 0 && nums != null){
	            
	            HashMap<Integer,Integer> map = new HashMap<>();
	            
	            for(int i=0; i<nums.length; i++){
	                
	                int complement = target - nums[i];
	                
	                if(map.containsKey(complement)){
	                	//map.get(complement);
	                    return new int[] { map.get(complement), i };
	                    
	                }
	                else {
	                map.put(nums[i], i);
	                    
	                }
	            }
	        }
	        return new int[] {};
	    }
	
public int[] twoSum(int[] nums, int target) {
        
        if(nums.length != 0 && nums != null){
        Arrays.sort(nums);
        
        int right = 0;
        int left = nums.length-1;
        //2 3 4 
        while(right < left){
            if((nums[right] + nums[left]) == target){
                return new int[] {right, left};
            }
            else if((nums[right] + nums[left]) > target){
                left = left - 1;
            }
            else{
                right = right + 1;
            }
        }
        }
        return new int[] {};
    }

	public static int removeDuplicates(int[] nums) {
	    //Given nums = [0,0,1,1,1,2,2,3,3,4]
        int uniqueValues = 0;
        //1 1 2
        
        
        if(nums.length != 0 && nums != null){ 
            uniqueValues++;
            int currentVal = nums[0];
            int currentIndex = 0;
        
        for(int i=1; i < nums.length; i++){
            
            if(nums[i] != currentVal){
                uniqueValues++;
                nums[currentIndex+1] = nums[i];
                currentIndex++;
                currentVal = nums[i];
                 
                }
            }
        }
        return uniqueValues; 
    }

	
	public static boolean isIsomorphicStr(String str1, String str2) {
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		boolean result = false;

		Map<Character, Character> map = new HashMap<>();
		Set<String> mySet = new HashSet<>();
		
		
		
		
		if (str1Char.length == str2Char.length) {
			for (int i = 0; i < str1Char.length; i++) {

				if (map.containsKey(str1Char[i])) {

					if (map.get(str1Char[i]) != str2Char[i]) {
						result = false;
					}
				}
				map.put(str1Char[i], str2Char[i]);
			}
			result = true;
		}
		return result;
	}
}
