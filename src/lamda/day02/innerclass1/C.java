package lamda.day02.innerclass1;

//로컬 클래스 : 생성자나 메서드 안에서 생성되는 클래스
public class C {
  C(){//생성자 안에서 클래스 생성
    class D{}
    D d = new D();
  }
  void method(){//메서드 안에서 클래스 생성
    class D{}
    D d = new D();
  }
}
