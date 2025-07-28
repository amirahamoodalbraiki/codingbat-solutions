
public Map<String, Integer> word0(String[] strings) {
  HashMap<String, Integer>rslt = new HashMap<>();

  for(String entry : strings){
    rslt.put(entry, 0);
  }
  return rslt;
}