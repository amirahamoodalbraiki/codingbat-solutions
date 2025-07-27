
public int[] fizzArray3(int start, int end) {
    int n = end-start;
    int[] array = new int[n];
    int c = start;
   
   for(int i = 0; i < n; i++) {
       array[i] = c;
       c++;
   }              
   return array;
}