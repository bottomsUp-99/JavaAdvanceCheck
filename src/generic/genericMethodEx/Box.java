package generic.genericMethodEx;


public class Box <T>{
  private T type;

  public T getType() { //제네릭 메서드 get
    return type;
  }

  public void setType(T type) { // 제네릭 메서드 set
    this.type = type;
  }
}