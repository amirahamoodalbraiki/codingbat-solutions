
public int sumNumbers(String str) {
  int tot = 0;
  
  for(int i = 0; i < str.length();i++) {
    if(!Character.isDigit(str.charAt(i))) {
      continue;
    } else {
      int a = i+1;
      
      while (a < str.length() && Character.isDigit(str.charAt(a))) {
        a++;
      }
      tot += Integer.parseInt(str.substring(i,a));
      i = a;
    } 
  }
  
  return tot;
}