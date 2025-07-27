
public String[] fizzBuzz(int start, int end) {
  String[] array = new String[end-start];
     
  for(int i = 0; i < array.length; i++) {
      int mul = i + start;    
      if(mul % 3 == 0 && mul % 5 == 0){
        array[i] = "FizzBuzz";
      } else if( mul % 5 == 0){
        array[i] = "Buzz";
      } else if( mul % 3 == 0){
        array[i] = "Fizz";
      } else{
        array[i] = String.valueOf(mul);
      }
  }              
  return array;
}
 