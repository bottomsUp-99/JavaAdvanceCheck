package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookComparatorEx {

  public static void main(String[] args) {
    ArrayList<Book2> bookList = new ArrayList<>();
    bookList.add(new Book2("세이노의 가르침", "세이토", "화이트혁명", 2001));
    bookList.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    bookList.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    bookList.add(new Book2("불안", "알랭 드 보통", "은행나무", 1999));
    bookList.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    bookList.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    bookList.add(new Book2("동물농장", "조지오웰", "민음사", 1989));
    bookList.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2001));
    bookList.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2000));
    bookList.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2008));
    bookList.add(new Book2("사피엔스", "유발 하라리", "김영사", 2010));
    bookList.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));
    bookList.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));


    //1. 제목 내림차순 정렬
    Collections.sort(bookList, new DescSubject());
    for (Book2 book2 : bookList){
      System.out.println(book2.getYear() + "   " + book2.getSubject());
    }
    System.out.println("===============================");

    //2. DescYear 비교기를 만들어 출판년도를 기준으로 내림 차순 정렬
    Collections.sort(bookList, new DescYear());
    for (Book2 book2 : bookList){
      System.out.println(book2.getYear() + "   " + book2.getSubject());
    }
    System.out.println("===============================");

    //3.
    Comparator<Book2> myComparator = new Comparator<Book2>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        return (o1.getYear() - o2.getYear())*(-1);
      }
    };
    Collections.sort(bookList, myComparator);
    for (Book2 book2 : bookList){
      System.out.println(book2.getYear() + "   " + book2.getSubject());
    }
    System.out.println("===============================");

    //4. 기준1 : 출판년도 최신 / 기준2. 출판년도가 같다면 제목의 글자수로 내리차순 / 기준3. 출판년도, 제목의 글자수까지 같다면 제목 내림차순
    Comparator<Book2> anotherComparator = new Comparator<Book2>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        int result = (o1.getYear() - o2.getYear())*(-1);
        if (result == 0){
          result = (o1.getSubject().length() - o2.getSubject().length()) * (-1);
        }
        if (result == 0) {
          result = (o1.getSubject().compareTo(o2.getSubject())) * (-1);
        }
        return result;
      }
    };
    Collections.sort(bookList, anotherComparator);
    for (Book2 book2 : bookList){
      System.out.println(book2.getYear() + "   " + book2.getSubject());
    }
  }
}
