package lamda.day02;

@FunctionalInterface//이것을 어노테이션 해줄건지는 선택사항이지만 컴파일 과정에서 추상메서드가 하나인지 검사할 때 정확한 함수형 인터페이스를 작성할 수 있게 도와줌.
public interface Calculable {
  public void calculate(int x, int y);
}
