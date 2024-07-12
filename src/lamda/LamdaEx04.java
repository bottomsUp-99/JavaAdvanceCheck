package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaEx04 {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Adam", "Eve", "Jane");

//    Collections.sort(names, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//      }
//    });
//    for (String name : names){
//      System.out.println(name);
//    }

    Collections.sort(names, (a, b) -> a.compareTo(b));
    for (String name : names) {
      System.out.println(name);
    }

    List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int sum = 0;
    for (int number : integers){
      //List 컬렉션의 값중에서 모든 짝수의 제곱의 합을 구하시오.
      if (number % 2 == 0){
        sum += (int) Math.pow(number, 2);
      }
    }
    System.out.println(sum);

    int sum1 = integers.parallelStream().filter(number -> number % 2 == 0)
        .mapToInt(number -> number*number)
        .sum();
  }
}
