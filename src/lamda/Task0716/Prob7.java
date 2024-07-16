package lamda.Task0716;

import java.util.Arrays;
import java.util.List;

public class Prob7 {

  public static void main(String[] args) {
    List<Integer> mmlists = Arrays.asList(1,2,3,4,5);
    mmlists.forEach(System.out::println);
    mmlists.stream().forEach(m -> System.out.println());
  }
}