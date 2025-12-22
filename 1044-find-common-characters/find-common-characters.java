class Solution {
    public List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);
        for(String word : words){
            int[] freq = new int[26];

            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }
            for(int i=0;i<26;i++){
                common[i] = Math.min(common[i], freq[i]);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<26;i++){
            while(common[i]-- > 0){
                result.add(String.valueOf((char) ('a' + i)));
            }
        }
        return result;
        
    }
}