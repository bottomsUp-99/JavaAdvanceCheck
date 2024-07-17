package dataIO.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.PortUnreachableException;

public class objectInputOutputEx {

  public static void main(String[] args) {
    try {
      //fos 에 oos라는 보조 스트림을 연결(영차!영차!)
      FileOutputStream fos = new FileOutputStream("/Users/zoohwan_99/Documents/부트캠프/member.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      //객체 생성
      Member member = new Member("ssg001", "김세계");
      Product product = new Product("p001", "선풍기");
      int[] ints = {10, 20, 30};
      String greeting = "Hello";

      //객체를 역직렬화 해서 파일에 저장.
      oos.writeObject(member);
      oos.writeObject(product);
      oos.writeObject(ints);
      oos.writeObject(greeting);

      oos.flush();
      oos.close();
      fos.close();

      //FileInputStream 에 보조스트림 ObjectInputStream 연결
      FileInputStream fis = new FileInputStream("/Users/zoohwan_99/Documents/부트캠프/member.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      //파일을 읽어 역직렬화해서 객체로 복원
      Member member1 = (Member) ois.readObject();
      Product product1 = (Product) ois.readObject();
      int[] ints1 = (int[]) ois.readObject();
      String greeting1 = (String) ois.readObject();

      ois.close();
      fis.close();
      System.out.println(member1);
      System.out.println(product1);
      System.out.println(ints1);
      System.out.println(greeting1);


    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
