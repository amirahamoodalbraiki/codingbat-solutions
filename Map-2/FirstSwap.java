
public String[] firstSwap(String[] strings) {
  Map<String, Integer> m = new HashMap();
  for (int i = 0; i < strings.length; i++){
    String s = strings[i];
    String l = s.substring(0,1);
    
    if(!m.containsKey(l)){
      m.put(l, i);
    } else if(m.get(l) >= 0) {
      int prev = m.get(l);
      strings[i] = strings[prev];
      strings[prev] = s;
      m.put(l, -1);
    }
  }
  return strings;
}