
public String sameEnds(String string) {
  String good = "";
  String tp = "";
  for (int i = 0; i < string.length(); i++) {
    tp=tp + string.charAt(i);
    if (i < string.length() / 2 && 
    tp.equals(string.substring(string.length()-tp.length(),string.length())))
      good = tp;
  }
  return good;
}