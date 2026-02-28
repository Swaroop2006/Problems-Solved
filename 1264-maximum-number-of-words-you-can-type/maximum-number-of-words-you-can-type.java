class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            set.add(ch);
        }
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
            boolean cantype = true;
            for(char ch : word.toCharArray()){
                if(set.contains(ch)){
                    cantype = false;
                    break;
                }
            }
            if(cantype){
                count++;
            }
        }
        return count;

    }
}