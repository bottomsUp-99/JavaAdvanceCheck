package generic.classEx;

public class Box <Z>{
  public Z content; // 해당 Box 안에는 다양한 내용물들이 저장될 수 있으므로 특정 클래스 타입으로 선어할 수 없다.
                    // 그러므로, 모든 타입 즉 모든 클래스의 최상위 부모 클래스로 자동 프로모션 되므로 content 필드에는 어떤 객체도 대입될 수 있다.
}//T는 파라미터 타입(기호)라고 한다.