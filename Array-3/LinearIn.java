
public boolean linearIn(int[] outer, int[] inner) {
    int i = 0;
    int o = 0;
      
    while(i < inner.length && o < outer.length) {
        if(inner[i] > outer[o]) {
            o++;
        } else if(inner[i] < outer[o]) {
            return false;
        } else {
            i++;
        }
    }

    if(i != inner.length)
        return false;
    return true;
}