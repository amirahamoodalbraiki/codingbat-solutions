
public String zipZap(String str) {
  
  String rslt  = "";
  
  if(!str.contains("z") || !str.contains("p")){
    return str;
  }
  for(int i = 0; i <= str.length()-1; i++){
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
rslt =rslt  + "zp";
      i+= 2;
    } else {
      rslt  += str.charAt(i);
    }
  }
  return rslt ;
}