public String deFront(String s) {
    if(s.length() == 1 && s.charAt(0) != 'a')
        return "";
        
    if(s.length() >= 2) {
        if(s.charAt(0) != 'a' && s.charAt(1) != 'b') {
            return s.substring(2);
        } else if(s.charAt(0) != 'a') {
            return s.substring(1);
        } else if(s.charAt(1) != 'b') {
            return "a" + s.substring(2);
        }
    }
    return s;
}