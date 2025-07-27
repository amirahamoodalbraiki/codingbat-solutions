
public String repeatSeparator(String word, String sep, int count) {
    if(count == 0) return "";
    
    String rslt = word;
    for(int i = 1; i < count; i++){
      rslt += sep;
      rslt += word;
    }
    return rslt;
}
  