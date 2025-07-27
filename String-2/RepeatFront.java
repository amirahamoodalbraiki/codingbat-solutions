
public String repeatFront(String str, int n) {
    String rslt = "";
    for(int i = 0; i < n; i++){
       
      String s = str.substring(0,n-i);
      rslt=rslt + s; 
    }
    return rslt;
}
  