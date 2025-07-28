
public Map<String, Integer> wordCount(String[] strings) {
  Map <String, Integer> rslt = new HashMap<>();
  
  for(String entry : strings){
     rslt.merge(entry, 1, (currentCount, notUsed) -> ++currentCount);
  }
 return rslt;
}