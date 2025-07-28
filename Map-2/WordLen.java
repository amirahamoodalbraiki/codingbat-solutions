
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> rslt = new HashMap();
  
  for( String entry : strings){
    rslt.put(entry, entry.length());
  }
  return rslt;
}