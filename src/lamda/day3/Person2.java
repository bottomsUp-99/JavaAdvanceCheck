package lamda.day3;


//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person2 {
  public Member getMember1(CreateIdMember creatable){
    String id = "ssg-manager";
    Member member = creatable.create(id);
    return member;
  }
  public Member getMember2(CreateIdNameMember creatable){
    String id = "ssg-manager";
    String name = "이어진";
    Member member = creatable.create(id, name);
    return member;
  }
}
//난 거덕인지도 몰루고, 우드 라잌 해드 어 스테이션