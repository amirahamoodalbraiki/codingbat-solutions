
public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] array = new String[n];
    int ai = 0;
    int bi = 0;
        
    for(int indx = 0; indx < n; indx++) {
        if(a[ai].compareTo(b[bi]) < 0) {
            array[indx] = a[ai];
            ai++;
        } else if(a[ai].compareTo(b[bi]) > 0) {
            array[indx] = b[bi];
            bi++;
        } else {
            array[indx] = a[ai];
            ai++;
            bi++;
        }
    }
    return array;
}