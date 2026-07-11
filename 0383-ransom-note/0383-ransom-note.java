class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        int[] ransomNoteFrequency = new int[26];
        int[] magazineFrequency = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            ransomNoteFrequency[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0; i < magazine.length(); i++){
            magazineFrequency[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(ransomNoteFrequency[i] > magazineFrequency[i]){
                return false;
            }
        }
        return true;
    }
}