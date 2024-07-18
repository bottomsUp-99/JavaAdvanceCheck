package morningTest0718;

import java.util.Arrays;
import java.util.List;

public class Prob11 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    System.out.println("11번 문제 정답 : " + numbers.stream().mapToInt(Integer::intValue).sum());
  }
}
