
public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> l= new ArrayList<String>();
    
    for(int i = 0; i < words.length; i++) {
        if(words[i].length() != len)
            l.add(words[i]);
    }
                    
    return l;
}