
public String[] allSwap(String[] strings) {
  Map<String, Integer> m = new HashMap();
  for (int i = 0; i < strings.length; i++){
    if (m.containsKey(strings[i].substring(0,1))){
      String string = strings[i];
      strings[i] = strings[m.get(strings[i].substring(0,1))];
      strings[m.get(strings[i].substring(0,1))] = string;
      m.remove(strings[i].substring(0,1));
    } else {
      m.put(strings[i].substring(0,1), i);
    }
  }
  return strings;
}