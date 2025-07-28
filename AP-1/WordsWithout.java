
public String[] wordsWithout(String[] words, String target) {
    int c = 0;
    
    for(int i = 0; i < words.length; i++) {
        if(!words[i].equals(target))
            c++;
    }
                    
    String[] array = new String[c];
    int indx = 0;
                          
    for(int i = 0; indx < c; i++) {
        if(!words[i].equals(target)) {
            array[indx] = words[i];
            indx++;
        }
    }
                                                    
    return array;
}