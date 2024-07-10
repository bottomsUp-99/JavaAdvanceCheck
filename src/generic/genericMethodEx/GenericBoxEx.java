package generic.genericMethodEx;

import generic.classEx.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box1 = boxing(100);
    int value1 = box1.getType();
    System.out.println(value1);

    //"포켓몬 포토카드"를 박싱하여 포장해주세요.
    Box<String> box2 = boxing("포켓몬 포토카드");
    //상자에서 포켓몬 포토카드를 꺼내주세요.
    String value2 = box2.getType();
    System.out.println(value2);

    //상자에서 미미 인형을 꺼내서 이름과 제조업체를 확인해 주세요.
    Box<Doll> box3 = boxing(new Doll());
    System.out.println(box3.getType().name);
    System.out.println(box3.getType().company);
  }

  public static <T> Box<T> boxing(T t){
    Box<T> box = new Box<T>();
    box.setType(t);
    return box;
  }
}
