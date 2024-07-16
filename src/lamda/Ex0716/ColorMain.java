package lamda.Ex0716;

import java.util.function.BiFunction;
import java.util.function.Function;

class Color{
  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed() {
    return red;
  }

  public void setRed(int red) {
    this.red = red;
  }

  public int getGreen() {
    return green;
  }

  public void setGreen(int green) {
    this.green = green;
  }

  public int getBlue() {
    return blue;
  }

  public void setBlue(int blue) {
    this.blue = blue;
  }
}
public class ColorMain {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Function<Integer, Color>> colorConstructor = (red, green) -> blue -> new Color(red, green, blue);
    Color color = colorConstructor.apply(255, 128).apply(64);
    System.out.println("Red : " + color.getRed());
    System.out.println("Green : " + color.getGreen());
    System.out.println("Blue : " + color.getBlue());
  }
}
