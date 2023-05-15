import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
            int[] nums = {3,2,4};
            System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target){
        int[] ouput = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                ouput[1] = i;
                ouput[0] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return ouput;
    }
}
