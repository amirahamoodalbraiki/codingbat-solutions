
public String wordAppend(String[] strings) {
  Map<String, Integer> m = new HashMap();
  String rslt = "";
  for(int i = 0; i < strings.length; i++){
    if(m.containsKey(strings[i])){
      m.put(strings[i], m.get(strings[i]) + 1);
    } else {
      m.put(strings[i], 1);
    }
    
    if(m.get(strings[i]) % 2  == 0){
      rslt += strings[i];
    }
    
  }
  return rslt;
}