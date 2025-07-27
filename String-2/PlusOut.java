
public String plusOut(String str, String word) {

    String rslt = "";
  
    for(int i = 0; i < str.length(); i++){
      if(str.substring(i).startsWith(word)){
        rslt += word;
        i += word.length() - 1;
      } else {
        rslt += '+';
      }
    }
    return rslt;
    
}
  