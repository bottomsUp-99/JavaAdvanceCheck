package lamda.Task0716;

import java.util.Arrays;
import java.util.List;

public class Prob8 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int sum = 0;

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 1){
        sum += (int) Math.pow(list.get(i), 2);
      }
    }

    System.out.println("홀수에 대한 제곱의 합 : " + sum);

    int total = list.stream().filter(d -> d % 2 == 1).reduce(0, Integer::sum);
    System.out.println(total);
  }
}
