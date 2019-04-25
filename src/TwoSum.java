import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
        int[] result = new int[2];//返回最后的结果
        for(int i = 0;i < nums.length;i++){
            m.put(nums[i],i);
        }

        for(int i =0; i < nums.length;i++){
            int tempNum = target - nums[i];
            if(m.containsKey(tempNum) && m.get(tempNum)!=i){
                result[0] = i;
                result[1] = m.get(tempNum);
                break;
            }
        }
        return result;
    }
}
