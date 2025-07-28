
public int noTeenSum(int a, int b, int c) {
    return fixed(a) + fixed(b) + fixed(c);
}

public int fixed(int n) {
    if(13 <= n && n <= 19 && n != 15 && n != 16)
        return 0;
            
    return n;
}