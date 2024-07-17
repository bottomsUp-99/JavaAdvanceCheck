package stream_lamda.functionInterface;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//@FunctionalInterface
//public interface Supplier<T>{
//  T get();
//}

//@FunctionalInterface
//public interface Consumer<T>{
//  void T accept(T t);
//  default Consumer<T> andThen(Consumer<? super T> after){
//    Object.requiredonNull(after);
//    return (T t) -> {accept(t); after.accept(t);};
//  }
//}
public class FunctionInterfaceEx {

  public static void main(String[] args) {
    //자바에서 제공하는 함수형 인터페이스

    Supplier<String> supplier = () -> "Hello Supplier";
    System.out.println(supplier);
    System.out.println(supplier.get());

    Consumer<String> consumer = (str -> System.out.println(str.split(" ")[0]));
    consumer.andThen(System.out::println).accept("Hello ssg.com");

    Function<String, Integer> function = String::length;
    function.apply("Hello Function Interface!");

    Predicate<String> predicate = (str -> str.equals("very pretty"));
    System.out.println(predicate.test("pretty"));

  }
}
