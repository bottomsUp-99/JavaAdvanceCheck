package stream_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullEx {

  public static void main(String[] args) {
    List<String> nameList = Arrays.asList("BBB", "CCC", "AAA", "DDD");

    //Optional 클래스는 제너릭 타입을 사용하여 값의 타입을 지정한다.

    //1-1) 존재 여부에 따른 처리
    String value = "Hello Optional!";
    String value1 = null;

    //1-1-1. Optional.of(value) Optional 객체 생성한다.
    Optional<String> optionals = Optional.of(value);

    //1-1-2. Optionals 객체의 값의 유무 확인
    if (optionals.isPresent()){
      System.out.println(optionals.get());
    }
    optionals.ifPresent(System.out::println);//둘 다 같은 의미

    //2. Null 처리 방법
    Optional<String> optionals1 = Optional.ofNullable(value1);

    //2-1. orElse를 사용해서 null 인 경우 기본값 반환, null이 아닌 경우 결과값 반환
    String result = optionals1.orElse("반갑습니다. null 처리 메세지 입니다.");
    System.out.println(result);
  }
}
