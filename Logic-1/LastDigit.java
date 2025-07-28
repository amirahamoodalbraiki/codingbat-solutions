
public boolean lastDigit(int a, int b, int c) {
    int ct = 0;
    for(int i = 0; i < 3; i++){
      if(a % 10 == b % 10){
        ct++;
      } else if (b % 10 == c % 10){
        ct++;
      } else if (a % 10 == c % 10){
        ct++;
      }
    }
    if(ct >= 2){
      return true;
    }
    return false;
  }