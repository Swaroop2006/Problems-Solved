class Solution {
    public String greatestLetter(String word) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        String s = "";
        for(char ch = 'z';ch>='a';ch--){
            if(set.contains(ch) && set.contains(Character.toUpperCase(ch))){
                return String.valueOf(Character.toUpperCase(ch));
            }
        }
        return s;
    }
}