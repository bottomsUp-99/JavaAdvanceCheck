package morningTest0718;

import java.util.Arrays;
import java.util.List;

public class Prob12 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    numbers = numbers.stream().filter(num -> num % 2 == 0).toList();
    int sum = 0;
    for (Integer num : numbers){
      sum += (int) Math.pow(num, 2);
    }
    System.out.println("12번 정답 : " + sum);
  }
}
