import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));        
    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> numsNonDup = new HashSet<Integer>();
        for(int i=0;i< nums.length;i++){
            if(numsNonDup.contains(nums[i])) return true;
            numsNonDup.add(nums[i]);
        }
        return false;
    }
}
