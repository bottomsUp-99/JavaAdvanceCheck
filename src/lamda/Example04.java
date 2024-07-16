package lamda;

public class Example04 {
  @FunctionalInterface
  interface Operator{
    public int apply(int x, int y);
  }
  public static int[] scores = {90, 80, 60};
  public static int maxOrMin(Operator operator){
    int result = scores[0];
    for (int score : scores) {
      result = operator.apply(result, score);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin((x, y) -> x > y ? x : y);

    int min = maxOrMin((x, y) -> x > y ? y : x);
  }
}
