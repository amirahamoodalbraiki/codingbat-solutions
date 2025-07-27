
public String starOut(String str) {
    String rslt = "";
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '*' || i > 0 && str.charAt(i-1) == '*' || i < str.length()-1 && str.charAt(i+1) == '*') {
        continue;
      } 
       rslt= rslt +str.charAt(i);
    }
  return rslt;
}