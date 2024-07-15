package lamda.day02.innerclass2;

public class A {
  //A클래스(바깔 클래스)의 인스턴스 필드와 메서드
  int field1;
  void method1(){
    System.out.println("A의 메서드1");
  }
  String field3 = "A - field - 값";

  //A클래스(바깥 클래스)의 정적 필드와 메서드
  static int field2;
  static void method2(){}

  //인스턴스 멤버 클래스
  private class B{
    String field = "B - field";
    void method(){
//      //A 클래스의 인스턴스 필드와 메서드 사용
//      field1 = 10;
//      method1();
//      method2();
//
//      field2 = 10;
//      method2();
      System.out.println("B - method");
    }
    void print(){
      System.out.println(this.field);
      this.method();
      System.out.println(A.this.field1 + A.this.field3);
      A.this.method1();
    }
    //A의 인스턴스 메서드
    void useB(){
      B b = new B();
      b.print();
    }
  }
  static class C{
    void method(){
      //A의 인스턴스 필드와 메서드를 사용
//      field1 = 10;
//      method1();

      //A의 정적 필드와 메서드 사용
      field2 = 10;
      method2();
    }
  }
}
