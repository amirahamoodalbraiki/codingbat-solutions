
public boolean endsLy(String s) {
    if(s.length() < 2)
        return false;
          
    return s.substring(s.length() - 2).equals("ly");
}