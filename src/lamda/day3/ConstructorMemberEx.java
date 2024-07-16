package lamda.day3;

public class ConstructorMemberEx {

  public static void main(String[] args) {
    Person2 user = new Person2();
    Member m1 = user.getMember1(Member :: new);
    Member m2 = user.getMember2(Member :: new);
    System.out.println(m1);
    System.out.println(m2);
  }
}
