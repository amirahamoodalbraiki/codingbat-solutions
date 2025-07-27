
public String extraFront(String s) {
    if(s.length() >= 2)
        s = s.substring(0, 2);
          
    return s+s +s;
}