package lamda;

import java.util.ArrayList;
import java.util.List;
import lamda.LamdaEx02.ArrayOperation;

public class LamdaEx03 {
//   *  1.  정수 리스트를 받아 정수를 반환하는 단일 추상 메서드 getMax()를 사용하여 FindMax 인터페이스를 생성하세요
//   *  2.  정수 리스트를 반복하고 최대값을 찾는 람다식을 구현합니다.
//   *  3.  최대값은 Integer.MIN_VALUE 로 설정 한 후 더 놓은 숫자가 나타나면 업데이트 합니다.
//   *      최대값은 변수 max에 저장 합니다.
//   *  4.  정수리스트를 생성합니다.
//   *  5.  max 객체에서 getMax() 호출하여 최대값을 출력합니다.
//   *
  public static void main(String[] args) {
    FidMax maxNum = numbers -> {
      int max = Integer.MIN_VALUE;
      for (int num : numbers){
        if (num > max) max = num;
      }
      return max;
    };
    List<Integer> arr = new ArrayList<>();
    arr.add(12);
    arr.add(33);
    arr.add(23);
    arr.add(34);
    arr.add(11);
    int result = maxNum.getMax(arr);
    System.out.println("Result : " + result);
  }
  @FunctionalInterface
  interface FidMax{
    int getMax(List<Integer> numbers);
  }
}