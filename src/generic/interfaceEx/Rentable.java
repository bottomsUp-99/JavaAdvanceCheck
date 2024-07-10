package generic.interfaceEx;

public interface Rentable<P> {//다양한 대상을 렌트하기 위한 rent() 메서드의 타입을 타입 파라미터로 지정
  public P rent();

}
