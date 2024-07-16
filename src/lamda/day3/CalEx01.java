package lamda.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalEx01 {

  //사용자로부터 두 개의 정수를 받아 데이터를 저장하고 있는 메소드 action()
  //메소드 action()는 Calculable 타입을 전답 받아 Calculable 인터페이스의 calculate 메서드로 데이터를 처리하는 메서드이다.
  //action()을 이용하여 입력받은 두 개의 정수를 더하기, 곱하기 연산을 하는 람다식
  //그 결과를 바로바로 출력하여 확인
  public static void main(String[] args) throws IOException {
//    action((x, y) -> {
//      int plus = x + y;//합
//      System.out.println("두 수의 합 : " + plus);
//
//      int multi = x * y;//곱
//      System.out.println("두 수의 곱 : " + multi);
//    });

    //여기 Person class test
    Person user = new Person();
    user.action(
        (x, y) -> {
          int result = x + y;
          return result;
        }
    );
    user.action(((x, y) -> (x + y)));
  }

//  public static String processData() throws IOException{
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    return br.readLine();
//  }
//
//  public static void action(Calculable calculable) throws IOException{
//    int x = Integer.parseInt(processData());
//    int y = Integer.parseInt(processData());
//    calculable.calculate(x, y);
//  }
  }
//실행 어라운드 패턴