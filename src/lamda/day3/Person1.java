package lamda.day3;


//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person1 {
  public void ordering(Comparable comparable){
    String name1 = "SSG";
    String name2 = "KSG";

    int result = comparable.compare(name1, name2);
    if (result < 0) {
      System.out.println(name1 + "은 " + name2 + "보다 앞에 섭니다.");
    } else if (result == 0){
      System.out.println(name1 + "은 " + name2 + "와 같이 섭니다.");
    } else {
      System.out.println(name1 + "은 " + name2 + "보다 뒤에 섭니다.");
    }
  }
}
//난 거덕인지도 몰루고, 우드 라잌 해드 어 스테이션