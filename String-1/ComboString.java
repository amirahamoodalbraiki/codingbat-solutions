
public String comboString(String a, String b) {
    if(b.length() < a.length()) {
        String com = a;
        a = b;
        b = com;
    }
                  
    return a + b + a;
}