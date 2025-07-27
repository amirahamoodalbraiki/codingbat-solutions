
public int close10(int a, int b) {
    int aa = Math.abs(a - 10);
  int bb = Math.abs(b - 10);
  if (aa < bb) {
    return a;
  }
  if (bb < aa) {
    return b;
  }
  return 0;
}
