package lamda.day02.innerclass1;

public class DD {
  public  void method3(int n) {
    //로컬 변수
    final int var = 1;

    //로컬 클래스 선언
    class E{
      void method4(){
        //로컬 변수
        System.out.println("n값 : " + n);
        System.out.println("var값 : " + var);

        //var = 2; //로컬 클래스에서는 로컬 변수의 값을 수정할 수 없다.
      }
    }
    //로컬 객체 생성
    E e = new E();
    e.method4();
//    e.method3();
//    var = 5;
  }
}
//로컬 변수를 로컬클래스에서 사용할 경우, 로컬변수는 final 특성을 부여한다.
//값을 읽을 수만 있고, 값을 수정할 수 없도록 제한(로컬 클래스 내부에서 값 변경을 불가하도록 제한함.)