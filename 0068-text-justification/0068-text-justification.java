class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int WordCount = 0;
        int TotalLength = 0;
        StringBuilder str = new StringBuilder();
        for(String word : words){
            if(TotalLength+word.length() + WordCount<=maxWidth){
                str.append(word);
                str.append(" ");
                TotalLength+=word.length();
                WordCount++;
            }
            else if(WordCount==1){
                str.setLength(str.length()-1);
                int NoOfSpaces = maxWidth - str.length();
                str.append(" ".repeat(NoOfSpaces));
                list.add(str.toString());
                str.setLength(0);
                str.append(word);
                str.append(" ");
                TotalLength = word.length();
                WordCount = 1;
            }
            else{
                str.setLength(str.length()-1);
                int SpaceCount = maxWidth - TotalLength - (WordCount - 1);
                int x = 0;
                int index = str.indexOf(" ");
                while(index!=-1 && x<WordCount-1){
                    int NoOfSpaces = SpaceCount/(WordCount-1) + (x<SpaceCount%(WordCount-1)?1:0);
                    str.insert(index," ".repeat(NoOfSpaces));
                    x++;
                    index = str.indexOf(" ",index+NoOfSpaces+1);
                }
                list.add(str.toString());
                str.setLength(0);
                str.append(word);
                str.append(" ");
                TotalLength = word.length();
                WordCount = 1;
            }
        }
        str.setLength(str.length()-1);
        int NoOfSpaces = maxWidth - str.length();
        str.append(" ".repeat(NoOfSpaces));
        list.add(str.toString());
        return list;
    }
}