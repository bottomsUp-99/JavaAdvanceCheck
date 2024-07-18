package morningTest0718;

import java.util.Arrays;
import java.util.List;

public class Prob7 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    System.out.println("7번 문제 정답 : " + numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum());
  }
}
