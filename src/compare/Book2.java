package compare;

import lombok.AllArgsConstructor;
import lombok.Data;

//Book vo : 데이터 객체
@Data
@AllArgsConstructor
public class Book2 {

  private String subject;//책 제목
  private String writer;//지은이
  private String publisher;//출판사
  private int year;//출판년월일




}