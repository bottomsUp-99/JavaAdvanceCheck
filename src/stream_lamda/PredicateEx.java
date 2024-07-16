package stream_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

  public static void main(String[] args) {
    Predicate<Integer> isPositive = n -> n>0;
    System.out.println(isPositive.test(5));
    System.out.println(isPositive.test(-5));

    List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);
    //Predicate 타입으로 정의한 isPositive 를 이용하여 filter 처리
    List<Integer> positiveNumbers = filter(numbers, isPositive);

    //결과 출력
    System.out.println("양수인 숫자들 : " + positiveNumbers);
    positiveNumbers.forEach(System.out::println);
  }

  public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
    List<T> filterList = new ArrayList<>();
    for (T item : list){
      if (predicate.test(item)){
        filterList.add(item);
      }
    }
    return filterList;
  }
}
