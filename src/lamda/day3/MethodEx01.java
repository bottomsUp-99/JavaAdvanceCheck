package lamda.day3;

public class MethodEx01 {

  public static void main(String[] args) {
    Person1 user = new Person1();
    user.ordering(String :: compareToIgnoreCase);
    user.ordering((name1, name2) -> name1.compareToIgnoreCase(name2));
  }
}
//사람의 이름 비교하기 위해 String 클래스의 인스턴스 메서드 compareToIgnoreCase() 메서드를 참조하여 사용
//name1이 name2보다 사전순으로 먼저이면, 음수를 리턴