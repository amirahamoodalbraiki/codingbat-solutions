
public int wordsCount(String[] words, int len) {
    int c = 0;
    
    for(int i = 0; i < words.length; i++) {
        if(words[i].length() == len)
            c++;
    }
                    
    return c;
}