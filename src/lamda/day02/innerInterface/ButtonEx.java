package lamda.day02.innerInterface;

public class ButtonEx {

  public static void main(String[] args) {
    Button okbtn = new Button();

    class OKListener implements Button.ClickListener{

      @Override
      public void onClick() {
        System.out.println("OK 버튼 클릭!");
      }
    }
    okbtn.setClickListener(new OKListener());
    okbtn.click();

    //Cancel 버튼 생성
    Button cancelbtn = new Button();
    //Cancel 버튼 클릭 이벤트를 처리할 ClickListener 클래스 구현
    class CancelListener implements Button.ClickListener{
      @Override
      public void onClick() {
        System.out.println("Cancel 버튼 클릭!");
      }
    }
    //구현 클래스 setting
    cancelbtn.setClickListener(new CancelListener());
    //cancel 버튼 클릭
    cancelbtn.click();
  }
}
