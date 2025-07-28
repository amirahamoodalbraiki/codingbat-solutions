
public int scoresSpecial(int[] a, int[] b) {
    return ls(a) + ls(b);
}

public int ls(int[] a) {
    int lrg = 0;
      
    for(int i = 0; i < a.length; i++) {
        if(a[i] % 10 == 0 && a[i] > lrg)
            lrg = a[i];
    }

    return lrg;
}