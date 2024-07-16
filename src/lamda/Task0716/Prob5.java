package lamda.Task0716;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prob5 {

  public static void main(String[] args) {
    //1. foreach 방식
    List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    list.forEach(System.out::println);

    //2. IntStream 방식
    IntStream.rangeClosed(0,10).forEach(System.out::println);
  }
}