package lamda.Task0716;

import java.util.Arrays;
import java.util.List;

public class Prob9 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int sum = list.stream().filter(number -> number % 2 == 1 ).mapToInt(Integer::intValue).sum();
    System.out.println(sum);
  }
}
