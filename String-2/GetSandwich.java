
public String getSandwich(String str) {
  int FI = str.indexOf("bread");
    
  int LI = str.lastIndexOf("bread");
    
  if(FI == -1 || LI == -1 || FI == LI){
    return "";
  } else {
      return str.substring(FI+5, LI);
  }
}
  