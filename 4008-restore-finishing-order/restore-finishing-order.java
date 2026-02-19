class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int f : friends){
            set.add(f);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int id : order){
            if(set.contains(id)){
                res.add(id);
            }
        }
        int[] arr = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}