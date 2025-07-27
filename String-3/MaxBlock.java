
public int maxBlock(String str) {
  int c = 0;
  
  if(str.length() == 0) return 0;
  
  for(int i = 0; i < str.length()-1; i++) {
    int j = i + 1;
    
    while(j < str.length() && str.charAt(j) == str.charAt(i)) {
      j =j+ 1;
    }
    int block = j - i;
    
    if(block > c){
      c = block;
    }
  }

  return c;
}