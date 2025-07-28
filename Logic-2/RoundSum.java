
public int roundSum(int a, int b, int c) {
    return r10(a) + r10(b) + r10(c);
}

public int r10(int num) {
    int r= num % 10;
      
    if(r >= 5)
        return num + 10 - r;
                
    return num - r;
}