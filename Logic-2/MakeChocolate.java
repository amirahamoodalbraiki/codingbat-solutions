
public int makeChocolate(int small, int big, int goal) {
    int rmndr = goal >= 5 * big ? goal - (5 * big) : goal % 5;
    
    return rmndr <= small ? rmndr : -1;
}