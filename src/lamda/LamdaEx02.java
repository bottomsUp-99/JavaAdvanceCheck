package lamda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LamdaEx02 {

  public static void main(String[] args) throws IOException {
    //문제 1. 두 정수를 받아서 그 합을 반환하는 람다식 작성하세요
    //1.두 정수를 받아 그 합을 반환하는 람다식 작성.
    MathOperation addition = (a, b) -> (a+b);

    //2. 한수형 인터페이스 인스턴스 생성 operate() 호출 결과 반환
    int result1 = addition.operate(5, 3);
    System.out.println("Result1 = " + result1);

    ////////////////////////////////////////////////////////
    //문제 2. 문자열을 받아 그 길이를 반환하는 람다표현식을 작성하세요.
    //1. 인터페이스의 이름 : StringOperation

    StringOperation length = string -> string.length();
    int result2 = length.getLength("Hello Lamda");
    System.out.println("Result2 = " + result2);

    //문제 3. 정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식 작성.
    //인터페이스의 이름 : ArrayOperation
    ArrayOperation evenSum = numbers -> {
      int sum = 0;
      for (int num : numbers){
        if (num % 2 ==0) sum += num;
      }
      return sum;
    };
    int[] arr = {1,2,3,4,5};
    int result3 = evenSum.calculateSum(arr);
    System.out.println("Result3 = " + result3);
  }


  //1. 두 개의 정수를 받아 정수를 반환하는 단일메서드 'operate'가 있는 함수형 인터페이스 mathOperation을 정의
  //2. 두 개의 정수 a, b 를 더하는 람다표현식을 생성(a, b) -> a+b
  //3. 람다 표현식을 사용하여 함수형 인터페이스의 인스턴스를 생성하고 operate()호출해서 두 수샂의 합을 구한다.
  @FunctionalInterface
  interface MathOperation{
    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation{
    int getLength(String string);
  }

  @FunctionalInterface
  interface ArrayOperation{
    int calculateSum(int[] numbers);
  }
}
