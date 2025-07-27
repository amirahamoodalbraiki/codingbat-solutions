public boolean endOther(String a, String b) {
  String LCA = a.toLowerCase();
  String LCB = b.toLowerCase();
    
  return LCA.endsWith(LCB) || LCB.endsWith(LCA); 
}
  