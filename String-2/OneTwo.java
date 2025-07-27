
public String oneTwo(String str) {
  String rslt = "";
  for(int i = 0; i < str.length() - 2; i+=3) {
      
    if(i < str.length()) {
      rslt += str.substring(i+1, i+3);
      rslt += str.substring(i,i+1);  
    }
      
  }
  return rslt;  
}
  