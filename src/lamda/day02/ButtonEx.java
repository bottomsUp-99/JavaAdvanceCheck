package lamda.day02;

public class ButtonEx {

  public static void main(String[] args) {
    Button btn = new Button();
    btn.setClickListener(
        ()->{
          System.out.println("버트인 클릭되었습니다.");
        }
    );
    btn.click();

    Button cancelbtn = new Button();
    cancelbtn.setClickListener(
        ()->{
          System.out.println("Cancel 버튼이 클릭되었습니다.");
        }
    );
    cancelbtn.click();
  }
}
