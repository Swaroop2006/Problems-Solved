class Solution {
    public boolean detectCapitalUse(String word) {
         if(allupper(word) || alllower(word) || firstletter(word)){
            return true;
         }
         return false;
    }
    private boolean allupper(String word){
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if(count == word.length()){
            return true;
        }
        return false;

    }
    private boolean alllower(String word){
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                count++;
            }
        }
        if(count == word.length()){
            return true;
        }
        return false;

    }
    private boolean firstletter(String word){
        char ch = word.charAt(0);
        String s = word.substring(1);
        if(Character.isUpperCase(ch) && alllower(s)){
            return true;
        }
        return false;
    }
}