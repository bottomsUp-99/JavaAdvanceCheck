package compare;

import java.util.Comparator;

//제목 기준 내림차순 비교기
public class DescSubject implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    int result = (o1.getSubject().compareTo(o2.getSubject()))*(-1);
    return result;
  }
}
