
public String repeatEnd(String str, int n) {
    String s = str.substring(str.length()-n);
    String rslt = "";
    for(int i = 0; i < n; i++){
      rslt=rslt + s;
    }
    return rslt;
}