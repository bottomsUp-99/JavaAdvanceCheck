package compare;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

//Book vo : 데이터 객체
@Data
@AllArgsConstructor
public class Book implements Comparable<Book> {

  private String subject;//책 제목
  private String writer;//지은이
  private String publisher;//출판사
  private int year;//출판년월일


  //출판년도 기준으로 오름차순 정렬
//  @Override
//  public int compareTo(Book o) {//내부에서 비교 처리 후, 비교 결과를 int 형으로 리턴
//    if (this.year == o.year){
//      return 0;
//    }
//    else if (this.year < o.year){
//      return -1;//오름차순
//    }
//    else {
//      return 1;//내림차순
//    }
//  }


  //책 제목 사전순으로 정렬
//  @Override
//  public int compareTo(Book o) {//내부에서 비교 처리 후, 비교 결과를 int 형으로 리턴
//    int result = this.getSubject().compareTo(o.getSubject());
//    return result;
//  }


  //책 제목 기준 사전순으로 정렬을 하되, 만약 책 제목이 동일하다면 출판년도별로 오름차순으로 정렬
  @Override
  public int compareTo(Book o) {//내부에서 비교 처리 후, 비교 결과를 int 형으로 리턴
    int result = this.getSubject().compareTo(o.getSubject());
    if (result == 0){
      result = this.year - o.year;
    }
    return result;
  }


}
//compareTo(object o) 메서드 작성
//현재 객체 < 파라미터로 넘어온 객체 : 음수
//현재 객체 == 파라미터로 넘어온 객체 : 0
//현재 객체 > 파라미터로 넘어온 객체 : 양수
//음수 또는 0이면 객체의 자리가 그대로 유지
//양수이면 객체의 자리가 바뀐다.