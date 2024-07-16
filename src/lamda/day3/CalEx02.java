package lamda.day3;

import java.util.Arrays;
import java.util.List;

public class CalEx02 {

  public static void main(String[] args) {
    Person user = new Person();
    //user는 컴퓨터의 덧셈기를 이용하여 두 수를 더하여 결과를 확인한다.
//    Person.action(Computer :: adder); // static 메서드 adder 참조

    //user는 컴퓨터의 곱셈기를 이용하여 두 수를 곱하여 결과를 확인한다.
    Computer com = new Computer();
//    Person.action(com :: multiply ); // Computer의 인스턴스 메서드 multiply 참조

    List<Integer> list = Arrays.asList(1,2,3,4,5);
    list.forEach(System.out::println);
  }
}
