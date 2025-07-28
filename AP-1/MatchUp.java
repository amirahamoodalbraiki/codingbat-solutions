
public int matchUp(String[] a, String[] b) {
    int c = 0;
    
    for(int i = 0; i < a.length; i++) {
        if(a[i].length() > 0 && b[i].length() > 0 && 
            a[i].charAt(0) == b[i].charAt(0))
            c++;
    }
                          
    return c;
}