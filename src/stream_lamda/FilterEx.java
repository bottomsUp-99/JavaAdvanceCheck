package stream_lamda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("이주환");
    list.add("이승준");
    list.add("김종완");
    list.add("김형주");
    list.add("이준무");
    list.add("손정민");
    list.add("홍서영");
    list.add("정효인");
    list.add("김수연");
    list.add("이주환");
    list.stream().distinct().forEach(System.out::println);

    System.out.println("=============================");

    list.stream().filter(joohwan -> joohwan.startsWith("이")).forEach(System.out::println);

    System.out.println("=============================");

    list.stream().distinct().filter(joohwan -> joohwan.startsWith("이")).forEach(System.out::println);
  }
}
