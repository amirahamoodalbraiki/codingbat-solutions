
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> m = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++) {
    if(m.containsKey(strings[i])){
      m.put(strings[i], true);
    } else {
      m.put(strings[i], false);
    }
  }
  return m;
}