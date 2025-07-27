
public String doubleChar(String str) {
  String rslt = "";
  for(int i = 0; i < str.length(); i++){
    rslt = rslt + str.charAt(i) + str.charAt(i);
  }
  return rslt;
}