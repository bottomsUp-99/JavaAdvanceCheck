package generic.interfaceEx;

public class RentEx {

  public static void main(String[] args) {
    Codi codi = new Codi();
    AirConditioner airConditioner = codi.rent();
    airConditioner.powerOn();
  }
}
