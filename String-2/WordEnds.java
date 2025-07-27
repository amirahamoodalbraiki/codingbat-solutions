
public String wordEnds(String str, String word) {
  String rslt = "";
  for(int i = 0; i < str.length(); i++){
    if(str.substring(i).startsWith(word)) {
      
      if(i != 0){
        rslt += str.charAt(i - 1);  
      }  
      
      if(i + word.length() < str.length()) {
        rslt=rslt + str.charAt(i + word.length());
        } 
    }
  }
  return rslt;
}