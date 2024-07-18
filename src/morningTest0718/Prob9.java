package morningTest0718;

import java.util.Random;
import java.util.function.Supplier;

public class Prob9 {

  public static void main(String[] args) {
    Supplier<Random> sp = Random::new;
    Random random = sp.get();
  }
}
