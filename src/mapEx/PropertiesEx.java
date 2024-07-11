package mapEx;

import java.util.Properties;

public class PropertiesEx {

  public static void main(String[] args) throws Exception {
    //Properties 컬렉션 생성
    Properties properties = new Properties();

    //Properties 클래스를 기준으로 database.properties 를 읽어온다.(상대경로)
    //Class 객체의 getResourceAsStream 메서드는 주어진 상대 경로의 리소스 파일을 읽어와 InputStream을 리턴해준다.
    properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));

    String driver = properties.getProperty("driver");
    String url = properties.getProperty("url");

    System.out.println(driver);
    System.out.println(url);
  }
}
