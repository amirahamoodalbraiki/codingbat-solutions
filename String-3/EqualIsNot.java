
public boolean equalIsNot(String str) {
  int IC = 0;
  int NC = 0;
  
  for(int i = 0; i < str.length(); i++){
    if(str.substring(i).startsWith("is")){
      IC += 1;
    } else if (str.substring(i).startsWith("not")){
      NC += 1;
    }
  } 
  return IC == NC;
}