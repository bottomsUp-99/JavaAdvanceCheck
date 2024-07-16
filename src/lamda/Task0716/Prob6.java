package lamda.Task0716;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob6 {

  static int answer = 0;

  public static void main(String[] args) {
    int sum;

    int[] arr = {1,2,3,4,5};
    List<Integer> list = new ArrayList<>();

    for (Integer num : arr){
      list.add(num);
    }
    sum = list.stream().mapToInt(Integer::intValue).sum();

    list.stream().forEach(integer -> answer += integer);
    System.out.println(sum);

    //Collection에 담긴 객체를 처리하는 반복자 3가지
    //1. iterator 구성 방식
    //2. stream 구성 방식
    //3. while(iter.hasNext() == true) { Object next = iter.next();}
  }
}
