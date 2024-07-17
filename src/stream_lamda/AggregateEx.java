package stream_lamda;

import java.util.Arrays;

public class AggregateEx {

  public static void main(String[] args) {
    //정수형 배열 Array
    int[] array = {1,2,3,4,5};

    //array 요소 세기
    long count = Arrays.stream(array).count();
    System.out.println(count);
    System.out.println(array.length);

    //총합
    long sum = Arrays.stream(array).sum();
    System.out.println(sum);

    //평균
    double avg = Arrays.stream(array).average().getAsDouble();
    System.out.println(avg);

    //최대값
    int max = Arrays.stream(array).max().getAsInt();
    System.out.println(max);

    //최소값
    int min = Arrays.stream(array).min().getAsInt();
    System.out.println(min);

    //첫번째 요소
    int first = Arrays.stream(array).findFirst().getAsInt();
    System.out.println(first);

    //2의 배수 중 첫번째 요소
    int first1 = Arrays.stream(array).filter(num -> num % 2 ==0).findFirst().getAsInt();
    System.out.println(first1);
  }
}
