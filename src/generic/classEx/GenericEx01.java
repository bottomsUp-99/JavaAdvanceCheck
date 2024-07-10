package generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Box<String> box = new Box<String>();
    box.content = "러브 레터";
    String content = box.content;
    System.out.println(content);

    Box<Integer> box1 = new Box<Integer>();
    box1.content = 100;
    int content1 = box1.content;
    System.out.println(content1);

    Box<Doll> box2 = new Box<Doll>();
    box2.content = new Doll();
    Doll content2 = box2.content;
    System.out.println(content2);

    Product<SmartPhone, String> p1 = new Product<SmartPhone, String>();
    p1.setKind(new SmartPhone());
    p1.setModel("Apple 15 pro max");
    SmartPhone applePhone = p1.getKind();
    String applePhoneModel = p1.getModel();
    System.out.println(applePhone + " : " + applePhoneModel);

    Product<Car, String> c1 = new Product<Car, String>();
    c1.setKind(new Car());
    c1.setModel("Ferrari SF90");
    Car ferrari = c1.getKind();
    String ferrariModel = c1.getModel();
    System.out.println(ferrari + " : " + ferrariModel);
  }
}
