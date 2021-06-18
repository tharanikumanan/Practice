import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfIntegers {
    public static void main(String[] args)
    {
        int[] nums={1,3,7,4,1,6};
         int target = 6;
         int[] result =new int[2];
        result= new SumOfIntegers().twoSum(nums,target);
        System.out.println(result[0]+":::::"+result[1]);
}
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
