package lamda;

public class Example02 {
  @FunctionalInterface
  interface Operator{
    public int apply(int x, int[] y);
  }
  public static int[] scores = {90, 80, 60};
  public static int maxOrMin(Operator operator){
    int result = scores[0];
    return operator.apply(result, scores);
  }

  public static void main(String[] args) {
    int max = maxOrMin((x, y) -> {
      int tmp = x;
      for (Integer num : y){
        if (num > tmp) tmp = num;
      }
      return tmp;
    });

    int min = maxOrMin((x, y) -> {
      int tmp = x;
      for (Integer num : y){
        if (num < tmp) tmp = num;
      }
      return tmp;
    });
  }
}
