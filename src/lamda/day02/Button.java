package lamda.day02;

public class Button {

  //함수형 인터페이스 정의
  @FunctionalInterface
  public static interface ClickListener{
    void onClick();
  }
  private ClickListener clickListener;

  //메서드
  public void setClickListener(ClickListener clickListener){
    this.clickListener = clickListener;
  }
  public void click(){
    this.clickListener.onClick();
  }
}
