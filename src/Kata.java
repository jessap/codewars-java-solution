/*
Sum without highest and lowest number

Sum all the numbers of the array except the highest and the lowest element 
(the value, not the index!).
(The highest/lowest element is respectively only one element at each edge, 
even if there are more than one with the same value!)

Example:

{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6
*/

import java.util.Arrays;

public class Kata
{    
  public static int sum(int[] numbers){
  int result = 0;
  if (numbers !=null && numbers.length > 1) {
      Arrays.sort(numbers);
      for (int i = 1; i < numbers.length-1; i++){
        result += numbers[i];
      }
  }
  return result;
  }
 
}
