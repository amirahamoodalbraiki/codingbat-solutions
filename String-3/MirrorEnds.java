
public String mirrorEnds(String string) {
  String good = "";
  
  for(int i = 0; i <= string.length(); i++) {
    String mir = string.substring(0, i);
    String rev = new StringBuffer(mir).reverse().toString();
    
    if(string.startsWith(mir) && string.endsWith(rev)) {
      good = mir;
    }
  }
  return good;
}