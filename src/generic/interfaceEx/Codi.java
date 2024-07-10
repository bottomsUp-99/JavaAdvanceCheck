package generic.interfaceEx;

public class Codi implements Rentable<AirConditioner>{

  @Override
  public AirConditioner rent() {
    return new AirConditioner();
  }
}
