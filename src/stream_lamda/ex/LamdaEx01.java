package stream_lamda.ex;
//함수형 인터페이스? 함수를 변수처럼 선언해서 사용하는 개념
//코드를 간결하게 작성할 수 있따.

@FunctionalInterface
interface Func{
  int max(int n1, int n2);
}
public class LamdaEx01 {

  public static void main(String[] args) {
    //익명 함수
//    System.out.println(new fun1(){
//      public int max(int n1, int n2){
//        return n1 > n2 ? n1 : n2;
//      }
//    }.max(5, 7));

    Func func = (int a, int b) -> a > b ? a : b; // 순수 함수(pure function) : 람다식으로 생성된 함수로써 인터페이스로만 선언이 가능하다.
    System.out.println(func.max(3, 5));

  }
}
