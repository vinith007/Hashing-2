//Time Complexity is O(n) and space Complexity is O(n)
public class SumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return -1;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int rsum = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            rsum = rsum + nums[i];
            if(map.containsKey(rsum - k)){
                count = count + map.get(rsum - k);

            }
            map.put(rsum, map.getOrDefault(rsum,0)+1);
        }

        return count;
    }

}
