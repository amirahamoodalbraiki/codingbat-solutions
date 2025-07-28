
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> rslt = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++){
    if(rslt.containsKey(strings[i].substring(0,1))){
      rslt.put(strings[i].substring(0,1), (rslt.get(strings[i].substring(0,1)) + strings[i]));
    }  else {
      rslt.put(strings[i].substring(0,1), strings[i]);
    }
  }
  return rslt;
}