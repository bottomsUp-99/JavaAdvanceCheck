package lamda.day02.innerInterface;

public class Button {
  public static interface ClickListener{
    void onClick();
  }

  //setter 메서드를 이옹하여 ClickListener 구현 객체를 injection
  private ClickListener clickListener;
  public void setClickListener(ClickListener clickListener){
    this.clickListener = clickListener;
  }

  public void click(){
    this.clickListener.onClick();
  }
}
//버튼이 클릭되었을때, 실행할 메서드