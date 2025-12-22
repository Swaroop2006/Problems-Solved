class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int operations = 0;
        for(int num : nums){
            int need = k - num;
            if(map.getOrDefault(need,0) > 0){
                operations++;
                map.put(need, map.get(need) - 1);
            }else{
                map.put(num,map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
        
    }
}