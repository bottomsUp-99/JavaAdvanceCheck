package morningTest0718;

import java.util.function.Supplier;

public class Prob8 {

  public static void main(String[] args) {
    Supplier<String> sp = String::new;
    String str = sp.get();
  }
}
