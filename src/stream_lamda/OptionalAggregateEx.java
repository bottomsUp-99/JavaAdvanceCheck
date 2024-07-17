package stream_lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalAggregateEx {

  public static void main(String[] args) {
    //평균
    //Optional을 이용하여 null 처리를 하는 방법 3가지
    //1. isPresent()   //2. orElse()   //3. isPresent()

    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(10);
    list.add(10);
    list.add(10);
    list.add(10);

    //1. isPresent()
    OptionalDouble optional1 = list.stream().mapToInt(Integer::intValue).average();
    if (optional1.isPresent()){
      System.out.println(optional1.getAsDouble());
    } else {
      System.out.println("0.0");
    }

    //2. orElse()
    double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    System.out.println(avg);

    //3. ifPresent()
    list.stream().mapToInt(Integer::intValue).average().ifPresent(avg1 -> System.out.println(avg1));
    list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
  }
}
