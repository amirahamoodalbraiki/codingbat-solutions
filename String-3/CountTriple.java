
public int countTriple(String str) {
  int c = 0;
  
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)){
      c =c+1;
    }
  }
  return c;  
}