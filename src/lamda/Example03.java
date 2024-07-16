package lamda;

public class Example03 {
  @FunctionalInterface
  interface Operator{
    public int apply(int x, int y);
  }
  public static int[] scores = {90, 80, 60};
  public static int maxOrMin(Operator operator){
    int result = scores[0];
    for (int i = 0; i < scores.length; i++) {
      result = operator.apply(result, scores[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin((x, y) -> Math.max(x, y));

    int min = maxOrMin((x, y) -> Math.min(x ,y));
  }
}
