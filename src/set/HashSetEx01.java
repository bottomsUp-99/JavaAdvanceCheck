package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    //객체 저장
    set.add("신세계");
    set.add("신세계");
    set.add("신세계1");
    System.out.println(set.size());
    System.out.println("================================");

    Set<Member> memberList = new HashSet<>();
    memberList.add(new Member("ssg", 20));
    memberList.add(new Member("ksg", 20));
    memberList.add(new Member("lsg", 20));
    memberList.add(new Member("msg", 20));

    //회원을 반복자 Iterator 를 이용해서 가져오기
    Iterator<Member> iterator = memberList.iterator();
    while (iterator.hasNext()){
      //회원 한명 가져오기
      Member member = iterator.next();
      System.out.println(member.name + "\t" + member.age);
      if (member.name.equals("ksg")) iterator.remove();
    }
    System.out.println("================================");

    //회원을 반복자 Iterator 를 이용해서 가져오기
    Iterator<Member> iterator1 = memberList.iterator();
    while (iterator1.hasNext()){
      //회원 한명 가져오기
      Member member = iterator1.next();
      System.out.println(member.name + "\t" + member.age);
      if (member.name.equals("ssg")) iterator1.remove();
    }
    System.out.println("================================");
    memberList.removeIf(member -> "msg".equals(member.getName()));//이렇게도 삭제 가능.
    System.out.println("================================");

    //회원을 enhanced fot 를 이용해서 가져오기
    for (Member member : memberList){
      System.out.println(member.name + "\t" + member.age);
    }
    System.out.println(memberList.size());
  }
}