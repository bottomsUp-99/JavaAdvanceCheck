package lamda.day3;


//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person {

  public static void action(Calculable calculable){
    int x = 10;
    int y = 10;
    int result = calculable.calculate(x, y);
    System.out.println(result);
  }
}
//난 거덕인지도 몰루고, 우드 라잌 해드 어 스테이션