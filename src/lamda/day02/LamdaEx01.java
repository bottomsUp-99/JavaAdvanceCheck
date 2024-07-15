package lamda.day02;

public class LamdaEx01 {

  public static void main(String[] args) {
    action(
        (x,y) -> {
          int result = x + y;
          System.out.println(result);
        }
    );

    //람다식은 인터페이스의 익명 구현 객체
    //action 메서드는 람다식을 이용해서 내부 데이터를 처리하는 처리부이다.
    action(
        (x,y) -> {
          int result = x * y;
          System.out.println(result);
        }
    );
  }
  //익명 구현 객체
  public static void action(Calculable calculable){
    //데이터
    int x = 10;
    int y = 20;

    //데이터 처리
    calculable.calculate(x, y);
  }
}
